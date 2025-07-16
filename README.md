# ToDoList2

# ✅ To-Do List App en Android (Kotlin)

Una aplicación sencilla para gestionar tareas con una interfaz moderna, desarrollada en Android utilizando Kotlin y componentes como RecyclerView, CardView y SharedPreferences.

---

## 🎯 Funcionalidades

- Agregar nuevas tareas
- Marcar/desmarcar como completadas
- Eliminar tareas deslizando hacia los lados (swipe)
- Mostrar cantidad de tareas pendientes
- Animaciones suaves y diseño limpio con Material Design

---

## 📁 Estructura del Proyecto

app/src/main/java/com/sakhura/todolist/
├── MainActivity.kt
├── adapter/
│ └── TareasAdapter.kt
├── model/
│ └── Tarea.kt
└── utils/
└── SwipeToDeleteCallback.kt

app/src/main/res/layout/
├── activity_main.xml
└── item_tarea.xml

app/src/main/res/values/
└── colors.xml (define purple_500)


---

## 🧰 Tecnologías Utilizadas

- Kotlin
- Android SDK
- RecyclerView
- CardView
- SharedPreferences (próximamente)
- Material Design

---

## 🚀 Cómo Ejecutar el Proyecto

### 1. Clonar o Descargar

Descarga el `.zip` o clónalo desde tu repositorio:

git clone https://github.com/Sakhura/ToDoList2

2. Abrir en Android Studio
Abre Android Studio

Ve a File > Open y selecciona la carpeta del proyecto

3. Sincronizar Gradle
Android Studio sincronizará automáticamente

Si no lo hace, haz clic en File > Sync Project with Gradle Files

4. Ejecutar la App
Conecta un dispositivo o usa un emulador

Presiona ▶️ "Run App"

🧪 Cómo Usar la App
Escribe una tarea en el campo de texto.

Presiona el botón "Agregar".

Verás tu tarea aparecer en la lista.

Puedes:

Marcarla como completada ✅

Eliminarla deslizando hacia los lados 🗑️

El contador se actualiza automáticamente.

✨ Mejoras Futuras
Editar tareas existentes

Filtros para ver solo tareas pendientes o completadas

Persistencia de datos con SharedPreferences

Tema oscuro

🧑‍💻 Autor
Desarrollado por Sabina
Contacto: sabina.romero@gmail.com
GitHub: https://github.com/Sakhura
