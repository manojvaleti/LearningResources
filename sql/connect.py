import mysql.connector
from mysql.connector import Error
from collections import defaultdict


start_time,end_time=map(int,input().split())

connection_config_dict = {
	'user' : 'root',
	'passwd' : 'manoj',
	'host' : '127.0.0.1',
	'database': 'test'

}

try:

#establishing sql connection
	connection = mysql.connector.connect(**connection_config_dict)

#checking the status of connection
	if connection.is_connected():
		print("connection established")
		cursor = connection.cursor()

#declaring a dictionary of empty lists		
		d={}
		d=defaultdict(lambda:[],d)

#obtaining id from tableA if endtime is between start and end time.		
		sql_query = """SELECT ID from TABLE_A where ENDTIME between %s and %s"""
		cursor.execute(sql_query,(start_time,end_time))
		l = cursor.fetchall()
		get_first_id=[]
		if(len(l)!=0):
		    for i in l:
			    get_first_id.append(i[0])	


#obtaining Id1 from table b 		
		sql_query = """SELECT ID1 from TABLE_B where ID=%s and ID1 is not null"""
		temp_id1=[]
		temp_byte=[]
		for i in get_first_id:
			cursor.execute(sql_query,(i,))
			l = cursor.fetchall()
			print(l)

			#l will be a tuple (eg:([1,],[2,]))
			#l[0][0] will give 1
			#print(l[0][0])
			n=len(l)
			print(n)
			for j in range(n):
			    temp_byte.append(l[j][0])
			    d[i].append(l[j][0])
		
 
#delete entries from TABLE C
		
		sql_query2 = """DELETE from TABLE_A where ID= %s"""

		for i in d:
			format_strings = ','.join(['%s'] *len(d[i]))
			cursor.execute("DELETE FROM TABLE_C where ID2 in (%s)" % format_strings,tuple(d[i]))
			cursor.execute("DELETE FROM TABLE_B where ID1 in (%s)" % format_strings,tuple(d[i]))
			cursor.execute(sql_query2,(i,))
			connection.commit()
		
		


except Error as e:
    print(e)
