import tkinter as tk
from tkinter import messagebox
from PIL import Image, ImageTk
import os

from clases.usuarios import usuarios
from formularios.frmDashboard import frmDashboard

def centrar_ventana(window, ancho, alto):
    window.update_idletasks()
    ancho_pantalla = window.winfo_screenwidth()
    alto_pantalla = window.winfo_screenheight()
    x = (ancho_pantalla // 2) - (ancho // 2)
    y = (alto_pantalla // 2) - (alto // 2)
    window.geometry(f"{ancho}x{alto}+{x}+{y}")

class frmLogin:
    def __init__(self, root=None):
        self.root = root or tk.Tk()
        self.root.title("INGRESO AL SISTEMA")
        self.root.configure(bg="#F2F2F2")
        self.root.resizable(False, False)

        ancho_ventana, alto_ventana = 850, 500
        centrar_ventana(self.root, ancho_ventana, alto_ventana)

        main_frame = tk.Frame(self.root, bg="#F2F2F2")
        main_frame.pack(fill="both", expand=True, padx=20, pady=20)

        lbl_titulo = tk.Label(
            main_frame,
            text="INGRESO AL SISTEMA",
            font=("Times New Roman", 20, "bold"),
            bg="#F2F2F2",
        )
        lbl_titulo.place(x=500, y=50)

        ruta_base = os.path.dirname(__file__)
        ruta_logo = os.path.abspath(os.path.join(ruta_base, "..", "imagenes", "logo.png"))
        ruta_icono = os.path.abspath(os.path.join(ruta_base, "..", "imagenes", "login.png"))

        logo_img = Image.open(ruta_logo)
        logo_img = logo_img.resize((360, 130))
        logo_tk = ImageTk.PhotoImage(logo_img)
        lbl_logo = tk.Label(main_frame, image=logo_tk, bg="#F2F2F2")
        lbl_logo.image = logo_tk
        lbl_logo.place(x=80, y=150)

        try:
            icon_img = Image.open(ruta_icono)
            icon_img = icon_img.resize((60, 60))
            icon_tk = ImageTk.PhotoImage(icon_img)
            lbl_icon = tk.Label(main_frame, image=icon_tk, bg="#F2F2F2")
            lbl_icon.image = icon_tk
            lbl_icon.place(x=600, y=110)
        except FileNotFoundError:
            lbl_icon = tk.Label(main_frame, text="👤", font=("Arial", 40), bg="#F2F2F2")
            lbl_icon.place(x=610, y=100)

        lbl_user = tk.Label(main_frame, text="Usuario:", font=("Arial", 12), bg="#F2F2F2")
        lbl_user.place(x=520, y=200)
        self.txt_user = tk.Entry(main_frame, width=25, font=("Arial", 12))
        self.txt_user.place(x=520, y=230)

        lbl_pass = tk.Label(main_frame, text="Clave:", font=("Arial", 12), bg="#F2F2F2")
        lbl_pass.place(x=520, y=270)
        self.txt_pass = tk.Entry(main_frame, width=25, font=("Arial", 12), show="*")
        self.txt_pass.place(x=520, y=300)

        btn_login = tk.Button(
            main_frame,
            text="🔓 Iniciar sesión",
            font=("Arial", 11, "bold"),
            bg="#E8E8E8",
            relief="raised",
            command=self.login,
        )
        btn_login.place(x=565, y=370)

        if not root:
            self.root.mainloop()

    def login(self):
        username = self.txt_user.get()
        clave = self.txt_pass.get()

        if not username or not clave:
            messagebox.showwarning("Campos vacíos", "Debes llenar todos los campos.")
            return

        usuario_dao = usuarios()
        user = usuario_dao.validarUsuario(username, clave)

        if user:
            messagebox.showinfo("Bienvenido", f"Hola, {user.nombre} {user.apellido} 👋")
            self.root.destroy()
            frmDashboard(user)
        else:
            messagebox.showerror("Error", "Usuario o contraseña incorrectos.")

if __name__ == "__main__":
    frmLogin()
