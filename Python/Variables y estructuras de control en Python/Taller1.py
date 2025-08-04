from datetime import date

print("=== CALCULADORA AVANZADA ===")
print("Fecha:", date.today())

try:
    # Entrada de datos
    num1 = float(input("Ingrese el primer número: "))
    num2 = float(input("Ingrese el segundo número: "))
    
    # Operaciones básicas
    suma = num1 + num2
    resta = num1 - num2
    multiplicacion = num1 * num2
    division = num1 / num2 if num2 != 0 else "Error: División por cero"
    
    # Nuevas operaciones solicitadas
    potencia = num1 ** num2
    modulo = num1 % num2 if num2 != 0 else "Error: Módulo por cero"
    
    # Presentación de resultados
    print("\nRESULTADOS:")
    print(f"{num1} + {num2} = {suma}")
    print(f"{num1} - {num2} = {resta}")
    print(f"{num1} * {num2} = {multiplicacion}")
    print(f"{num1} / {num2} = {division}")
    print(f"{num1} ** {num2} = {potencia}")  # Potencia
    print(f"{num1} % {num2} = {modulo}")     # Módulo
    
except ValueError:
    print("Error: Debe ingresar números válidos")
except Exception as e:
    print(f"Ocurrió un error inesperado: {str(e)}")

print("\nFin del programa")
