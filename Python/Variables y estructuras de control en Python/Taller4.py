# TALLER 4 - Curso de variables de Python

from datetime import date

# Obtener y mostrar fecha actual
hoy = date.today()  # Fecha actual
print("Hoy es el día:", hoy)
print()

# Ejercicio de clasificación de triángulos
print("EJERCICIO DE CLASIFICACIÓN DE TRIÁNGULOS")

# Solicitar valores de los lados del triángulo
a = float(input("Digite el valor del lado A: "))
b = float(input("Digite el valor del lado B: "))
c = float(input("Digite el valor del lado C: "))

# Clasificar el triángulo
if a == b == c:  # Equilátero: todos los lados iguales
    print("EL TRIÁNGULO ES EQUILÁTERO")
elif a == b or b == c or a == c:  # Isósceles: dos lados iguales
    print("EL TRIÁNGULO ES ISÓSCELES")
else:  # Escaleno: todos los lados diferentes
    print("EL TRIÁNGULO ES ESCALENO")

# Ejercicio de identificación de animales
print("\n" + "="*40)  # Línea separadora
animal = input("\nDigite un animal: ").upper()

if animal == "PERRO":
    print("Este animal es el mejor amigo del hombre:", animal)
elif animal == "GATO":
    print("Este animal persigue a los ratones:", animal)
elif animal == "OSO":
    print("Este animal vive en el polo norte:", animal)
else:
    print("No es PERRO, no es GATO, ni es OSO... es:", animal)

print("\nFIN DEL PROGRAMA")