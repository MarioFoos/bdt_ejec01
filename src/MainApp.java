
public class MainApp
{

	public static void main(String[] args)
	{
		// Ejercicio 1
		int[] arr = genArr(10);
		showArr(arr);
		System.out.println("Count: " + ocurrencias(1, arr));
	}

	/**
	 * Generar un array de enteros de un dígito
	 * @param len Longitud del array
	 * @return Array generado
	 */
	public static int[] genArr(int len)
	{
		if(len <= 0)
		{
			return null;
		}
		int[] arr = new int[len];
		for(int i = 0; i < len; ++i)
		{
			arr[i] = (int)(Math.random()*9) + 1;	// 1 a 9
		}
		return arr;
	}

	/**
	 * Mostrar por consola un array
	 * @param arr Array
	 */
	public static void showArr(int[] arr)
	{
		if((arr == null) || (arr.length == 0))
		{
			return;
		}
		System.out.println("Array:");
		for(int i = 0; i < arr.length; ++i)
		{
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}
	
	
	/**
	 * Buscar las ocurrencias de un valor  en un array
	 * @param buscado Valor a buscar
	 * @param arreglo Array
	 * @return Ocurrencias
	 */
	public static int ocurrencias(int buscado, int[] arreglo)
	{
		if((arreglo == null) || (arreglo.length == 0))
		{
			return 0;
		}
		int count = 0;
		for(int i = 0; i < arreglo.length; ++i)
		{
			if(arreglo[i] == buscado)
			{
				++count;
			}
		}
		return count;
		
	}
}
