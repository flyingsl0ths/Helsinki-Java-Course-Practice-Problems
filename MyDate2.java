/* Exercise 92: Difference of two dates: Solution obtained from
 * https://github.com/KWLN/mooc.fi-java-helsinki-I/blob/master/week5-092.DifferenceDate/src/MyDate.java 
*/

public class MyDate2 {
    private int day;
    private int month;
    private int year;

    public MyDate2(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate2 compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public int differenceInYears(MyDate2 comparedDate) {
        int diff;
        if (!earlier(comparedDate)) {
            diff = this.year - comparedDate.year;
            if (this.month < comparedDate.month) {
                return diff - 1;
            } else if (this.month == comparedDate.month) {
                return this.day < comparedDate.day ? diff - 1 : diff;
            }
            return diff;
        } else {
            diff = comparedDate.year - this.year;
            if (comparedDate.month < this.month) {
                return diff - 1;
            } else if (comparedDate.month == this.month) {
                return comparedDate.day < this.day ? diff - 1 : diff;
            }
            return diff;
        }
    }

}