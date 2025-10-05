from clases.conector import conector
from clases.usuario import usuario

class usuarios:
    def __init__(self):
        self.db = conector()

    def validarUsuario(self, username, clave):
        sql = "SELECT * FROM usuarios WHERE username = %s AND clave = %s"
        values = (username, clave)
        result = self.db.select(sql, values)
        
        if result and len(result) > 0:
            fila = result[0]
            return usuario(
                id=fila["id"],
                username=fila["username"],
                clave=fila["clave"],
                nombre=fila["nombre"],
                apellido=fila["apellido"],
                correo=fila.get("email", ""),
                rol=fila.get("rol")
            )
        else:
            return None

    def registrarUsuario(self, nombre, apellido, correo, username, clave, rol):
        """
        Inserta un nuevo usuario en la base de datos.
        Devuelve True si se insertó correctamente, False si hubo error.
        """
        sql = """
        INSERT INTO usuarios (nombre, apellido, email, username, clave, rol)
        VALUES (%s, %s, %s, %s, %s, %s)
        """
        values = (nombre, apellido, correo, username, clave, rol)
        
        return self.db.execute_query(sql, values)
