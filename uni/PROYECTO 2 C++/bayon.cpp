#include <iostream>
#include <stdlib.h>
using namespace std;

void menuOpciones();
void cargarNumerosAleatorios();
void cargarNumeros();
void buscarValor();
void valorMaximo();
void valorMinimo();
void ordenarAscendente();
void ordenarDescendente(); 
void encontrarDeterminante();
void ingresarUnaMatriz();

//Declaro variables globales que son genericas, estas las uso a lo largo del programa.
const int n = 3;
int matrizAgregada[n][n], matrizDeterminante[n][n],matrizRandom[n][n],eleccion;
bool salir=false;

//Llamo al main y le paso solo la funcion menuopciones.
int main(){
    menuOpciones();
    return 0;
}

//Declaro esta opcion como primera, ya que a partir de aqui occurre todo el programa.
//Lo hago dentro de un do while para que esto se pueda repetir solo hasta que el usuario decida salir.
void menuOpciones(){
    int menu;
    do{
        cout << "------------------------------------MENU---------------------------------------" << endl;
        cout << "1. Cargar matriz con numeros aleatorios y mostrarla ---------------------------" << endl;
        cout << "2. Cargar matriz con numeros agregados por el usuario y mostrarla -------------" << endl;
        cout << "3. Buscar un valor ingresado por el usuario -----------------------------------" << endl;
        cout << "4. Devolver el valor máximo de la matriz --------------------------------------" << endl;
        cout << "5. Devolver el valor mínimo de la matriz --------------------------------------" << endl;
        cout << "6. Ordenar los valores de la matriz de forma ascendente -----------------------" << endl;
        cout << "7. Ordenar los valores de la matriz de forma descendente ----------------------" << endl;
        cout << "8. Calcular el determinante de la matriz 3x3 ----------------------------------" << endl;
        cout << "9. Salir del programa ---------------------------------------------------------" << endl;
        cout << "-------------------------------------------------------------------------------" << endl;

        cout << "Ingrese el numero del ejercicio que quieras ejecutar: ";
        cin >> menu;
        cout  << endl << endl;

//Introduzco un switch para poder entrar en cada opcion segun el menu ya antes leido arriba.
        switch (menu){
        case 1:
            cargarNumerosAleatorios();
            break;
        case 2:
            cargarNumeros();
            break;
        case 3:
            buscarValor();
            break;
        case 4:
            valorMaximo();
            break;
        case 5:
            valorMinimo();
            break;
        case 6:
            ordenarAscendente();
            break;
        case 7:
            ordenarDescendente();
            break;
        case 8:
            encontrarDeterminante();
            break;
        case 9:
            salir=true;
            break;
        
        default:
            cout << "valor incorrecto." << endl;
            break;
        }
    } while (salir==false);

    cout << "--------------------------USTED FINALIZO EL PROGRAMA--------------------------" << endl;
}

void ingresarUnaMatriz() {
//Como esta funcion se repetia mucho a lo largo del programa, decidi hacerle una funcion donde sea un menu para elegir sobre que tipo de matriz el usuario va a aplicar.
//Aplica do while para que repita hasta que el usuario elija salir.
    do {
        cout << "1- Ingresar una matriz aleatoria." << endl;
        cout << "2- Ingresar una matriz con valores personalizados." << endl;
        cout << "3- Salir." << endl;
        cout << "Ingrese la opción deseada: ";
        cin >> eleccion;
        cout << endl;

        if (eleccion < 1 || eleccion > 3) {
            cout << "Opción inválida. Por favor, ingrese nuevamente." << endl;
        }
    } while (eleccion < 1 || eleccion > 3);
}

void cargarNumerosAleatorios(){
//Cargar matriz con numeros aleatorios:
//Utilizo dos "for" para iterar primero en la fila hasta el maximo (3) y lo mismo con las columnas.
//De esta forma le asigno a la matriz en la posicion de fila y de columna un valor random entre 1 y 100.
//Por ultimo se encarga de mostrarla en forma matricial.
    cout << "---------USTED INGRESO A GENERAR MATRIZ CON NUMEROS ALEATORIOS---------" << endl << endl;
    cout << "La matriz con numeros aleatorios quedaria: " << endl << endl;
    for (int fila = 0; fila < n; fila++){
        for (int col = 0; col < n; col++){
            matrizRandom[fila][col] = 1+rand()%(101-1);
            cout << matrizRandom[fila][col] << "\t";
        }
        cout << endl;
    }
    cout << endl << endl;
}

void cargarNumeros(){
    //Utilizo dos "for" para iterar primero en la fila hasta el maximo (3) y lo mismo con las columnas.
    //Y le pido al usuario que ingrese el numero que quiera en la poscion que se indica.
    cout << "----------------USTED INGRESO A GENERAR MATRIZ CARGANDO NUMEROS----------------" << endl << endl;
    int numeroAgregar;
    for (int fila = 0; fila < n; fila++){
        for (int col = 0; col < n; col++){
            cout << "Ingrese un numero en la posicion " << fila << " " << col << " : ";
            cin >> numeroAgregar;
            matrizAgregada[fila][col] = numeroAgregar;
        }
        cout << endl;
    }
    //Por ultimo la muestro en forma matricial en otro ciclo.
    cout << "La matriz con numeros agregados quedaria: " << endl;
    for (int fila = 0; fila < n; fila++){
        for (int col = 0; col < n; col++){
            cout << matrizAgregada[fila][col] << "\t";
        }
        cout << endl;
    }
    cout << endl << endl;
}

void buscarValor() {
    cout << "--------------------USTED INGRESO A BUSCAR UN VALOR--------------------" << endl << endl;
    int valorIngresado;
    bool encontrado = false;

//Le pido que ingrese un valor.
    cout << "Ingrese un valor para buscarlo en la matriz: ";
    cin >> valorIngresado;

//Llamo a la funcion que me permite seleccionar una matriz y aplico el switch.
    ingresarUnaMatriz();

//El switch se encarga de usar el valor que da la funcion "ingresarUnaMatriz()" y se mete en el case que le correspondiera.
    switch (eleccion) {
        case 1:

//En este caso se encarga de buscar el numero ya ingresado en la matriz de numeros randoms en la funcion de cargar numeros aleatorios.
            cargarNumerosAleatorios();

//hace la comprobacion mediante un ciclo de for´s y un condicional "IF" y de donde devolveria true si el valor es igual al numero de la matriz en esa coordenada.
            for (int fila = 0; fila < n; fila++) {
                for (int col = 0; col < n; col++) {
                    if (valorIngresado == matrizRandom[fila][col]) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    break;
                }
            }
            if (encontrado) {
                cout << "El valor ingresado (" << valorIngresado << ") se encuentra en la matriz." << endl;
            } else {
                cout << "El valor ingresado (" << valorIngresado << ") no se encuentra en la matriz." << endl;
            }
            cout << endl;
            break;

        case 2:
//En este caso se encarga de buscar el numero ya ingresado en la matriz de numeros ingresada por el usuario en la funcion de cargar numeros.
//Una vez cargado los numeros hace el mismo procedimiento que en matriz random y devuelve las respuesta segun corresponda.
            cargarNumeros();
            for (int fila = 0; fila < n; fila++) {
                for (int col = 0; col < n; col++) {
                    if (valorIngresado == matrizAgregada[fila][col]) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    break;
                }
            }
            if (encontrado) {
                cout << "El valor ingresado (" << valorIngresado << ") se encuentra en la matriz." << endl;
            } else {
                cout << "El valor ingresado (" << valorIngresado << ") no se encuentra en la matriz." << endl;
            }
            cout << endl;
            break;

        default:
            cout << endl;
            cout << endl;
            break;
    }
}

void valorMaximo(){
    int max;
    cout << "------------------------USTED INGRESO A VALOR MAXIMO--------------------" << endl << endl;
    //Llamo a la funcion que me permite seleccionar una matriz y aplico el switch.
    ingresarUnaMatriz();
    
    switch (eleccion){
    case 1:
//Cargo la matriz con numeros randoms y compruebo si el elemento actual es mayor que el siguiente, si es mayor lo guardo en max y cuando recorre toda la matriz lo imprime en consola.
        cargarNumerosAleatorios();
        max = matrizRandom[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matrizRandom[i][j] > max){
                    max=matrizRandom[i][j];
                } 
            }   
        }
        cout << "El mayor numero de la matriz es: " << max << endl << endl;
        break;
    case 2:
//Cargo la matriz con numeros que el usuario elija y compruebo si el elemento actual es mayor que el siguiente, si es mayor lo guardo en max y cuando recorre toda la matriz lo imprime en consola.
        cargarNumeros();
        max = matrizAgregada[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matrizAgregada[i][j] > max){
                    max=matrizAgregada[i][j];
                } 
            }   
        }
        cout << "El mayor numero de la matriz es: " << max << endl << endl;
        break; 
      
    default:
        cout << endl;
        cout << endl;
        break;
    }
}

void valorMinimo(){
    cout << "------------------------USTED INGRESO A VALOR MINIMO--------------------" << endl << endl;
    int min;

    ingresarUnaMatriz();
    switch (eleccion){
    case 1:
//Cargo la matriz con numeros randoms y compruebo si el elemento actual es mayor que el siguiente, si es mayor lo guardo en max y cuando recorre toda la matriz lo imprime en consola.
        cargarNumerosAleatorios();
        min = matrizRandom[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matrizRandom[i][j] < min ){
                    min=matrizRandom[i][j];
                } 
            }   
        }
        cout << "El menor numero de la matriz es: " << min << endl << endl;
        break;

    case 2:
//Cargo la matriz con numeros randoms y compruebo si el elemento actual es mayor que el siguiente, si es mayor lo guardo en max y cuando recorre toda la matriz lo imprime en consola.
        cargarNumeros();
        min = matrizAgregada[0][0];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (matrizAgregada[i][j] < min ){
                    min=matrizAgregada[i][j];
                } 
            }   
        }
        cout << "El menor numero de la matriz es: " << min << endl << endl;
        break;
    
    default:
        cout << endl;
        cout << endl;
        break;
    }
}

void ordenarAscendente() {
    cout << "--------------USTED INGRESO A ORDENAR LA MATRIZ (ASCENDENTEMENTE)--------------" << endl << endl;
    ingresarUnaMatriz();
    int arreglo[n * n];
    int contador = 0;

    switch (eleccion)
    {
    case 1:
        cargarNumerosAleatorios();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[contador] = matrizRandom[i][j];
                contador++;
            }
        }  

        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRandom[i][j] = arreglo[contador];
                contador++;
            }
        }
        cout << "La matriz Random ordenada ascendentemente quedaria: " << endl;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout << matrizRandom[i][j] << "\t";
            }
            cout << endl;
        }
        cout << endl;
        break;
        
    case 2:
        cargarNumeros();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[contador] = matrizAgregada[i][j];
                contador++;
            }
        }  

        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAgregada[i][j] = arreglo[contador];
                contador++;
            }
        }
        cout << "La matriz Random ordenada ascendentemente quedaria: " << endl;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout << matrizAgregada[i][j] << "\t";
            }
            cout << endl;
        }
        cout << endl;
        break;

    default:
        cout << endl;
        cout << endl;
        break;
    }
}

void ordenarDescendente(){
    cout << "--------------USTED INGRESO A ORDENAR LA MATRIZ (DESCENDENTEMENTE)--------------" << endl << endl;
    ingresarUnaMatriz();
    int arreglo[n * n];
    int contador = 0;

    switch (eleccion)
    {
    case 1:
        cargarNumerosAleatorios();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[contador] = matrizRandom[i][j];
                contador++;
            }
        }  

        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRandom[i][j] = arreglo[contador];
                contador++;
            }
        }
        cout << "La matriz Random ordenada ascendentemente quedaria: " << endl;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout << matrizRandom[i][j] << "\t";
            }
            cout << endl;
        }
        cout << endl;
        break;

    case 2:
        cargarNumeros();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arreglo[contador] = matrizAgregada[i][j];
                contador++;
            }
        }  

        for (int i = 0; i < n * n - 1; i++) {
            for (int j = 0; j < n * n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAgregada[i][j] = arreglo[contador];
                contador++;
            }
        }
        cout << "La matriz Random ordenada ascendentemente quedaria: " << endl;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cout << matrizAgregada[i][j] << "\t";
            }
            cout << endl;
        }
        cout << endl;
        break;
        
    default:
        cout << endl;
        cout << endl;
        break;
    }
}


void encontrarDeterminante(){
    cout << "--------------USTED INGRESO A ENCONTRAR DETERMINANTE--------------" << endl << endl;
    double det;
//Le pido al usuario que mediante ingresar una matriz seleccione sobre cual va a encontrar el determinante.
    ingresarUnaMatriz();

        switch (eleccion){
        case 1:
//Llamo a la funcion para cargar numeros aleatorios.
                cargarNumerosAleatorios();
                cout << "DETERMINANTE MATRIZ RANDOM: ";
//Calculo el determinante por una funcion dada en la matriz random.
                det = ( (matrizRandom[0][0] * matrizRandom[1][1] * matrizRandom[2][2]) + (matrizRandom[1][0] * matrizRandom[2][1] * matrizRandom[0][2]) + (matrizRandom[2][0] * matrizRandom[0][1] * matrizRandom[1][2]) )
                    - ( (matrizRandom[1][0] * matrizRandom[0][1] * matrizRandom[2][2]) + (matrizRandom[0][0] * matrizRandom[2][1] * matrizRandom[1][2]) + (matrizRandom[2][0] * matrizRandom[1][1] * matrizRandom[0][2]) );
                cout << det << endl << endl;
            break;
        
        case 2: 
//Llamo a la funcion para cargar numeros por teclado.
                cargarNumeros();
                cout << "DETERMINANTE MATRIZ: ";
//Calculo el determinante por una funcion dada para la matriz.
                det = ( (matrizAgregada[0][0] * matrizAgregada[1][1] * matrizAgregada[2][2]) + (matrizAgregada[1][0] * matrizAgregada[2][1] * matrizAgregada[0][2]) + (matrizAgregada[2][0] * matrizAgregada[0][1] * matrizAgregada[1][2]) )
                    - ( (matrizAgregada[1][0] * matrizAgregada[0][1] * matrizAgregada[2][2]) + (matrizAgregada[0][0] * matrizAgregada[2][1] * matrizAgregada[1][2]) + (matrizAgregada[2][0] * matrizAgregada[1][1] * matrizAgregada[0][2]) );
                cout << det << endl << endl;
            break;

        default:
            cout << endl;
            cout << endl;
            break;
        }
}

