# progra2
en este repositorio subiremos ejemplos de codigo de los patrones de diseños vistos en la materia programacion 2 de la carrera analista programador de ort
-----------
## Creación de ramas

Al momento de crear las ramas convenimos:

* El nombre debe ser en lowercase (minuscula).
* Debe contener unicamente el nombre y apellido.
* Si tienen muchos nombres y apellidos, usar su primer nombre y su primer apellido.
* Usar snake_case.

Ejemplo:

```
 git branch [apellido]_[nombre]
```

## Flujo de trabajo


1. Clonar el repositorio (branch y estructura)
     
   `git clone https://github.com/gabriela003/progra2.git`
   
2. Entrar a la carpeta del proyecto clonado y crear el branch con su apellido y nombre

   `git branch [apellido]_[nombre]`
   o
   `git checkout -b [apellido]_[nombre]`
   
3. Subir la rama que crearon
   
   `git push -u origin [apellido]_[nombre]`

4. Luego trabajar con el flujo habitual 

   `git add .`
   
   `git commit -m "mensaje de commit"`
   
   `git push`

-----------
