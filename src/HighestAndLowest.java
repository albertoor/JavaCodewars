/*
    In this little assignment you are given a string of space separated numbers,
    and have to return the highest and lowest number.

    Examples
        highAndLow("1 2 3 4 5")  // return "5 1"
        highAndLow("1 2 -3 4 5") // return "5 -3"
        highAndLow("1 9 3 4 -5") // return "9 -5"
 */
public class HighestAndLowest {

    public static int getHighestValue(String [] arr) {
        int max = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++)
            if (Integer.parseInt(arr[i]) > max)
                max = Integer.parseInt(arr[i]);
        return max;
    }

    public static int getLowestValue(String [] arr) {
        int min = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++)
            if (Integer.parseInt(arr[i]) < min)
                min = Integer.parseInt(arr[i]);
        return min;
    }

    public static void main(String[] args) {
        String numbers = "1 2 3 4 5";
        String [] str_numbers = numbers.split("\\ ");
        int highest = getHighestValue(str_numbers);
        int lowest = getLowestValue(str_numbers);
        String result = String.valueOf(highest) + " " + String.valueOf(lowest);
        System.out.println(result);
    }
}

// programming functional solution
/*
int min = Arrays.stream(numbers.split(" "))
        .mapToInt(i -> Integer.parseInt(i))
        .min()
        .getAsInt();

int max = Arrays.stream(numbers.split(" "))
        .mapToInt(i -> Integer.parseInt(i))
        .max()
        .getAsInt();

return String.format("%d %d", max, min);
*/