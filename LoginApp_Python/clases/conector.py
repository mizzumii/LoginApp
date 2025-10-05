import mysql.connector

class conector:
    def __init__(self):
        self.host = "localhost"
        self.user = "root"
        self.password = "admin"
        self.database = "sistema_usuarios"

    def connect(self):
        try:
            self.connection = mysql.connector.connect(
                host=self.host,
                user=self.user,
                password=self.password,
                database=self.database
            )
            self.cursor = self.connection.cursor(dictionary=True)
            return self.cursor
        except mysql.connector.Error as error:
            print("Error de conexión:", error)
            return None

    def close(self):
        if self.cursor and self.connection:
            self.cursor.close()
            self.connection.close()

    def select(self, sql, values=None):
        try:
            cursor = self.connect()
            cursor.execute(sql, values or ())
            result = cursor.fetchall()
            self.close()
            return result
        except mysql.connector.Error as error:
            print("Error SELECT:", error)
            return False

    def execute_query(self, sql, values=None):
        try:
            cursor = self.connect()
            cursor.execute(sql, values or ())
            self.connection.commit()
            self.close()
            return True
        except mysql.connector.Error as error:
            print("Error QUERY:", error)
            return False
