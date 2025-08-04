#Ejercicio dela guía del curso de 
#Variables y estructuras de control en Python

from datetime import date

# Obtener y mostrar fecha actual
hoy = date.today()    # fecha actual
print("Hoy es el día:", hoy)

# Operaciones con tres números enteros
a = int(input("Digite el primer número: "))
b = int(input("Digite el segundo número: "))
c = int(input("Digite el tercer número: "))
x = [a, b, c]

print("\nResultados con los números ingresados:")
print("El valor máximo es:", max(x))
print("El valor mínimo es:", min(x))
print("La suma de los 3 números es:", sum(x))

# Operaciones con número decimal
print("\n" + "="*40)  # Línea separadora
z = float(input("\nDigite un número con decimales: "))
redondo = round(z)
print("El valor de", z, "redondeado es:", redondo)

# Operaciones con texto
print("\n" + "="*40)  # Línea separadora
frase = input("\nDigite una oración: ")

print("\nTransformaciones de texto:")
print("La frase en mayúscula es:", frase.upper())
print("La frase en minúscula es:", frase.lower())
print("La frase con mayúscula inicial es:", frase.capitalize())
print("La frase con palabras en mayúsculas es:", frase.title())
print("La longitud de la frase es:", len(frase), "caracteres")

print("\nFIN DEL PROGRAMA")