void burbujeo(){
    int temp = 0;
    int arreglo[3] = {8,6,5};
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (arreglo[j] < arreglo[j+1])
            {
                temp = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = temp;
            }
            
        }
        
    }
    for (int i = 0; i < 3; i++)
    {
        cout << arreglo[i] << "\t";
    }
    
}