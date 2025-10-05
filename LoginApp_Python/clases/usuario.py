class usuario:
    def __init__(self, id=None, username="", clave="", nombre="", correo="", apellido="", rol=""):
        self.id = id
        self.username = username
        self.clave = clave
        self.nombre = nombre
        self.apellido = apellido
        self.correo = correo
        self.rol = rol