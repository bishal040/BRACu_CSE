package Task9;

class Quiz5{
    public int sum = 12, x = 2, y = 6;
    public Trace trace;
    public Quiz5(Trace t){
      trace = t;
      int x = trace.temp + y;
      sum = sum + (t.sum--) + y;
      System.out.println(trace.sum + " " + sum + " " + x);
      sum -= 10;
    }
    public void methodA(int sum, int temp){
      sum = 3 + sum - trace.sum;
      x = sum + 12 + y;
      y = trace.temp + temp + sum;
      this.sum = y + methodB(trace.temp, trace) + trace.temp;
      System.out.println(sum + " " + y + " " + this.sum);
    }
    public int methodB(int x, Trace temp){
      int sum = x + temp.sum + this.x;
      temp.temp = sum + this.sum;
      System.out.println(x + " " + temp.temp + " " + sum);
      return sum;
    }
   }
   
   
