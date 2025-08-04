#Taller 3 - curso de variables y estructuras de control en Python

from datetime import date

# Obtener y mostrar fecha actual
hoy = date.today()    # fecha actual
print("Hoy es el día:", hoy)

# Comparación de valores numéricos
a = int(input("Digite el valor de A: "))
b = int(input("Digite el valor de B: "))

if a > b:
    print("A es mayor que B")
elif a == b:
    print("A es igual a B")
else:
    print("A es menor que B")

# Verificación de programas de formación
print("\n" + "="*40)  # Línea separadora
curso1 = "Requerimientos"
curso2 = "Algoritmos"

print("El curso 1 es:", curso1)
print("El curso 2 es:", curso2)

if curso1 == "Requerimientos" and curso2 == "Algoritmos":
    print("Usted estudia Programación de Software")
else:
    print("Usted estudia otro programa diferente a Programación de Software")

# Análisis de texto
print("\n" + "="*40)  # Línea separadora
print("*** Final del Análisis del Programa de Formación SENA ***\n")

frase = input("Digite una oración: ")
print("La frase en mayúscula es:", frase.upper())
longitud = len(frase)
print("La longitud de la frase es:", longitud, "caracteres")

if longitud > 10:
    print("La frase contiene más de 10 caracteres")
else:
    print("La frase contiene 10 caracteres o menos")

print("\nFIN DEL PROGRAMA")