import tkinter as tk
from PIL import Image, ImageTk
import os

def centrar_ventana(window, ancho, alto):
    window.update_idletasks()
    ancho_pantalla = window.winfo_screenwidth()
    alto_pantalla = window.winfo_screenheight()
    x = (ancho_pantalla // 2) - (ancho // 2)
    y = (alto_pantalla // 2) - (alto // 2)
    window.geometry(f"{ancho}x{alto}+{x}+{y}")

class frmDashboard:
    def __init__(self, usuario):
        self.root = tk.Tk()
        self.root.title("Dashboard - Tecnar App")
        self.root.config(bg="white")
        self.root.resizable(False, False)

        ancho_ventana, alto_ventana = 800, 500
        centrar_ventana(self.root, ancho_ventana, alto_ventana)

        text_color = "#0B0B0B"

        lbl_title = tk.Label(
            self.root,
            text="BIENVENIDO AL SISTEMA",
            font=("Arial", 18, "bold"),
            bg="white",
            fg=text_color
        )
        lbl_title.pack(pady=(40, 10))

        img_path = os.path.join(os.path.dirname(__file__), "..", "imagenes", "userinfo.png")
        if os.path.exists(img_path):
            user_img = Image.open(img_path)
            user_img = user_img.resize((120, 120), Image.Resampling.LANCZOS)
            self.user_photo = ImageTk.PhotoImage(user_img)
            lbl_photo = tk.Label(self.root, image=self.user_photo, bg="white")
            lbl_photo.pack(pady=10)
        else:
            tk.Label(self.root, text="Usuario", bg="white").pack(pady=10)

        nombre = getattr(usuario, "nombre", None)
        apellido = getattr(usuario, "apellido", None)
        nombre_completo = f"{nombre} {apellido}" if nombre and apellido else "Usuario Desconocido"

        lbl_nombre = tk.Label(self.root, text=nombre_completo, font=("Arial", 14), bg="white", fg=text_color)
        lbl_nombre.pack()

        lbl_rol = tk.Label(self.root, text=getattr(usuario, "rol"), font=("Arial", 12), bg="white", fg=text_color)
        lbl_rol.pack()

        lbl_correo = tk.Label(self.root, text=getattr(usuario, "correo", "usuario@ejemplo.com"), font=("Arial", 11), bg="white", fg=text_color)
        lbl_correo.pack(pady=(5, 20))

        icon_frame = tk.Frame(self.root, bg="white")
        icon_frame.pack(pady=10)

        icons = ["face.png", "linkedin.png", "website.png", "logout.png"]
        self.icon_images = []

        for icon_file in icons:
            path = os.path.join(os.path.dirname(__file__), "..", "imagenes", icon_file)
            if os.path.exists(path):
                img = Image.open(path).resize((40, 40), Image.Resampling.LANCZOS)
                photo = ImageTk.PhotoImage(img)
                self.icon_images.append(photo)
                btn = tk.Button(
                    icon_frame,
                    image=photo,
                    bg="white",
                    bd=0,
                    activebackground="#E8E8E8",
                    cursor="hand2",
                    command=self.logout if "logout" in icon_file else None
                )
                btn.pack(side="left", padx=10)
            else:
                tk.Button(icon_frame, text=icon_file, bg="white").pack(side="left", padx=10)

        self.root.mainloop()

    def logout(self):
        self.root.destroy()
        from formularios.frmLogin import frmLogin
        frmLogin()
