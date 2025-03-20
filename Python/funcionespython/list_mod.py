def list_mod(lista):
    lista = lista.copy()
    lista.append(100)
    print(lista)

mi_lista = [1, 2, 3]
list_mod(mi_lista)
print(mi_lista)