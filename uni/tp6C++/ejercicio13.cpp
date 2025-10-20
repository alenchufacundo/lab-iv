#include <iostream>
using namespace std;

struct libro
{
    string titulo;
    string autor;
    int criticas[3];
    int año;
};

void llenarLista(libro arr[], int longitud, int& cantidad);

void ingresarLibro(libro &li);
void mostrar(libro arr[], int cantidad);
void buscarPorAutor(libro arr[], int cantidad);

double promedioCriticas(int arr[], int longitud);
double promedioGeneral(libro arr[], int cantidad);

int main(){
    int maxLibros = 100;
    libro lista[maxLibros];
    int cantLibros = 0;

    llenarLista(lista, maxLibros, cantLibros);
    mostrar(lista, cantLibros);
    cout << "El promedio general es: " << promedioGeneral(lista, cantLibros) << endl;

    buscarPorAutor(lista, cantLibros);
    return 0;
}

void llenarLista(libro arr[], int longitud, int& cantidad){
    char opcion = 'n';
    do{
        if (cantidad < longitud){
            libro nuevo;
            ingresarLibro(nuevo);
            arr[cantidad] = nuevo;
            cantidad++;
            cout << "Desea ingresar otro libro? si(s para si) o no(n para no)? ";
            cin >> opcion;
        }
        else{
            cout << "NO SE PUEDE INGRESAR OTRO LIBRO";
            opcion = 'n';
        }
    } while (opcion == 's' || opcion == 'S');
}

void ingresarLibro(libro& li){
    cout << "TITULO: ";
    cin.ignore();
    getline(cin, li.titulo);

    cout << "AUTOR: ";
    getline(cin, li.autor);

    cout << "AÑO: ";
    cin >> li.año;

    for (int i = 0; i < 3; i++){
        cout << "Ingrese critica " << i + 1 << ": ";
        cin >> li.criticas[i];
    }
}

void mostrar(libro arr[], int cantidad){
    for (int i = 0; i < cantidad; i++){
        cout << "El titulo: " << arr[i].titulo << endl;
        cout << "El autor: " << arr[i].autor << endl;
        cout << "El año: " << arr[i].año << endl;
        cout << "Promedio criticas: " << promedioCriticas(arr[i].criticas, 3) << endl;
        cout << endl;
    }
}

void buscarPorAutor(libro arr[], int cantidad){
    string busqueda;
    cout << "Ingrese el autor a buscar: ";
    cin.ignore();
    getline(cin, busqueda);
    bool bandera = false;
    for (int i = 0; i < cantidad; i++){
        if (busqueda == arr[i].autor){
            cout << "Titulo: " << arr[i].titulo << endl;
            cout << "Año: " << arr[i].año << endl;
            cout << "Promedio: " << promedioCriticas(arr[i].criticas, 3) << endl;
            cout << endl;
            bandera = true;
        }
    }
    if (!bandera){
        cout << "No se encontro." << endl;
    }
}

double promedioCriticas(int arr[], int longitud){
    double suma = 0;
    for (int i = 0; i < longitud; i++){
        suma += arr[i];
    }
    return (suma / longitud);
}

double promedioGeneral(libro arr[], int cantidad)
{
    double suma = 0;
    for (int i = 0; i < cantidad; i++){
        suma += promedioCriticas(arr[i].criticas, 3);
    }
    return (suma / cantidad);
}
