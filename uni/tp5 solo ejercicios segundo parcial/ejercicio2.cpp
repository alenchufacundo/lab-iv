    #include <iostream>
    using namespace std;

    int main(){
        int arreglo[] =  {1,2,3,4,5,6,7,8,9,10};
        int temp;
        //ordenar arreglo: 
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9-i; j++)
            {
                if (arreglo[j] > arreglo[j+1])
                {
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }        
        }

        for (int i = 0; i < 10; i++)
        {
            cout << arreglo[i] << "\t";
        }

        int sup, medio, inf, numero;
        sup = 9;
        inf = 0;
        int x = 0;

        cout << "ingrese un numero: " ;
        cin >> numero;

        while (inf <= sup && x==0)
        {
            medio = (inf + sup) / 2;

            if (numero == arreglo[medio])
            {
                x = 1;
            } 
            else if (numero < arreglo[medio])
            {
                sup = medio - 1;
            }
            else{
                inf = medio + 1;
            }
            
            
        }
        
        if (x == 1)
        {
            cout << "El numero se encontro en la pos: " << medio << endl;
        } else{
            cout << "El numero no pertenece al arreglo." << endl;
        }
        

    }
