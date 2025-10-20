using System;

internal class Program
{

    private static void Main(string[] args)
    {

        Console.WriteLine("Ingrese un numero");

        int num1 = int.Parse(Console.ReadLine());

        Console.WriteLine("Ingrese un numero");

        int num2 = int.Parse(Console.ReadLine());

        int resultado = num1 + num2;

        Console.WriteLine("La suma es de: " + resultado);

        Console.ReadLine();

    }

}