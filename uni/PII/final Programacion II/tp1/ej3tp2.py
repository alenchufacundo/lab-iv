cantNotas = int(input("Ingrese la cantidad de notas: "))
listaNotas = [cantNotas]

for i in range(cantNotas):
    nota = float(input("Ingrese la nota "+str(i+1)+": "))
    listaNotas.append(nota)


for i in range(cantNotas):
    print("Nota "+str(i+1)+": "+str(listaNotas[i+1]))


for i in range(cantNotas):
    if listaNotas[i+1] > listaNotas[1]:
        tempNota = listaNotas[i+1]
        posc = i
print("La nota mayor es: "+str(tempNota)+" y esta en la posicion: "+str(posc))
        