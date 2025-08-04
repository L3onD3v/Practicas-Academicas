# TALLER 5 Curso Python

from datetime import date

# Obtener y mostrar fecha actual
hoy = date.today()  # Fecha actual
print("Hoy es el día:", hoy)
print()

print("TALLER 5 - CICLOS ITERATIVOS CON LA SENTENCIA FOR")
print()

# Ciclo básico
num1 = int(input('Digite el primer número: '))
num2 = int(input('Digite el segundo número (mayor): '))

print("\nCiclo para el primer número:")
for i in range(num1):
    print(i)
print("Fin del ciclo")

# Ciclo entre dos números
print("\nCiclo desde el primer número hasta el segundo número:")
for i in range(num1, num2):
    print(i)
print("Fin del ciclo")

# Ciclo con incremento de 2
print("\nCiclo desde el primero hasta el segundo número con incrementos de 2:")
for i in range(num1, num2, 2):
    print(i)
print("Fin del ciclo")

# Ciclo para recorrer caracteres de una cadena
print("\n" + "="*40)  # Línea separadora
empresa = input("\nDigite nombre de una empresa: ")
empresa = empresa.lower()

print("\nCaracteres de la empresa:")
for caracter in empresa:
    print(caracter)
print("Fin del ciclo")

print("\nFIN DEL PROGRAMA")