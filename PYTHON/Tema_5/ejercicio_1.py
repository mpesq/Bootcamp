def bisiesto(anyo: int):
    if((anyo % 400 == 0) or ((anyo % 4 == 0) and (anyo % 100 != 0))):
        print(f"{anyo} es un año bisiesto")

    else:
        print(f"{anyo} no es una año bisiesto")


anyo: int = int(input("Introduce un año: "))
bisiesto(anyo)
