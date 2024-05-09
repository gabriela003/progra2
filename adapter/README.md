# adapter
Convierte la interfaz de una clase en otra interfaz que es la que esperan los clientes.

¿Cuando debo implementarlo?

- Se requiere usar una clase existente y su interfaz no concuerda con la que necesita.
- Se quiere crear una clase reutilizable que coopere con clases no relacionadas o que no han sido previstas, es decir, clases que no tienen porque tener interfaces compatibles.
- Es necesario usar varias subclases existentes, pero no resulta práctico adaptar su interfaz
heredando de cada una de ellas. Un Adaptador de objetos puede adaptar la interfaz de su clase padre.
