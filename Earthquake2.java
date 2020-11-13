import java.util.LinkedList;

class Earthquake2 {
  Earthquake2(){}

  // checks whether a datum is a date
  boolean isDate(double anum)
  {
    return (int)anum > 10000000;
  }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum)
  {
    return ((int)dateNum % 10000) / 100;
  }

  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month)
  {
    LinkedList<Double> dataList = cleaning(data,month);
    LinkedList<MaxHzReport> monthlyReport = new LinkedList<MaxHzReport>();
    double beatThis = 0.00;
    for (Double d: dataList);

    return null;
  }

  LinkedList<Double> cleaning(LinkedList<Double> data, int month) {
    LinkedList<Double> cleanedData = new LinkedList<Double>();
    boolean rightMonth = true;
    for (Double d: data) {
      if (isDate(d) && extractMonth(d) == month) {
        cleanedData.add(d);
        rightMonth = true;
      }
      if (rightMonth == true) {
        if (isDate(d) && extractMonth(d) != month)
          break;
        else if (d >= 0)
          cleanedData.add(d);
      }
    }
    return cleanedData;
  }

}

