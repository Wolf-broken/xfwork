import pymysql

def getAllQa():
    conn = pymysql.connect(host='127.0.0.1', user='root', password='', db='petition', port=3306)
    cur = conn.cursor()
    sql = "select * from QA"
    cur.execute(sql)
    result = cur.fetchall()
    cur.close()
    conn.close()
    return result


