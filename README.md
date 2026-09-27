# Unidad-3-Ejercicio-2
P 3 Unidad 3 Ejercicio 2
Ejercicio 2 — JList con DefaultListModel
En el ejercicio anterior la lista tenía contenido fijo. En este ejercicio vas a trabajar con DefaultListModel para que el contenido de la lista pueda modificarse dinámicamente en tiempo de ejecución.

Construí una ventana que simule una lista de tareas pendientes con los siguientes componentes:

Una etiqueta con el texto "Lista de tareas"
Una JList vacía al inicio, envuelta en un JScrollPane
Un campo de texto para ingresar el nombre de una nueva tarea
Un botón con el texto "Agregar tarea"
Un botón con el texto "Eliminar tarea seleccionada", que inicie deshabilitado
Una etiqueta que muestre la cantidad de tareas en la lista, con el formato: "Total de tareas: 0"
El comportamiento esperado es el siguiente:

Al presionar "Agregar tarea", el texto del campo debe agregarse a la lista y el contador debe actualizarse. Si el campo está vacío, no debe agregarse nada
Al seleccionar una tarea de la lista, el botón "Eliminar tarea seleccionada" debe habilitarse
Al presionar "Eliminar tarea seleccionada", el elemento seleccionado debe eliminarse de la lista, el contador debe actualizarse y el botón debe volver a deshabilitarse
💡 Tip: para obtener el índice del elemento seleccionado y eliminarlo del modelo usá lista.getSelectedIndex() y luego modelo.remove(indice).

<img width="737" height="497" alt="image" src="https://github.com/user-attachments/assets/a3b65af5-1e3d-4075-9a96-5f55558ec1d4" />
<img width="732" height="490" alt="image" src="https://github.com/user-attachments/assets/e0e7b317-f75c-41f4-bc1c-fd1e6c2ed92e" />
<img width="732" height="492" alt="image" src="https://github.com/user-attachments/assets/c55ae574-4b46-4d0a-aeed-558d4e94ca4b" />
<img width="732" height="495" alt="image" src="https://github.com/user-attachments/assets/935623be-7a1b-4fe0-b8ce-5b57bc75cb43" />
