# TALLER 6  Curso de Python

from datetime import date

# Obtener y mostrar fecha actual
hoy = date.today()  # Fecha actual
print("Hoy es el día:", hoy)
print()

print("TALLER 6 - CICLOS ITERATIVOS CON LA SENTENCIA WHILE")
print()

# Ciclo controlado por contador
num1 = int(input("Digite un número: "))
print("\n** Ciclo controlado por contador **")
i = 1
while i <= num1:
    print(i)
    i += 1
print('Fin del ciclo')

# Ciclo controlado por evento
print("\n** Ciclo controlado por evento **")
numero_secreto = 5  # Número a adivinar
intentos = 1
numero2 = int(input("Digite un número de 1 a 10: "))

while numero2 != numero_secreto:
    intentos += 1
    numero2 = int(input("Digite un número de 1 a 10: "))

print("\nAcertaste en el intento No.", intentos)
print('Fin del ciclo')

# Ciclo abortado con break
print("\n** Ciclo abortado con la sentencia break **")
amistad = input("Digite nombre de una amistad: ")
amistad = amistad.upper()

for caracter in amistad:
    print(caracter)
    if caracter == 'A':
        break

print("\nFin del ciclo (se encontró la letra A)")
print("\nFIN DEL PROGRAMA")