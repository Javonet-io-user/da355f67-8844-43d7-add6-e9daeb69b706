package Sample;

public enum RobotType {
  Simple(0L),
  Complex(1L),
  ;
  private long numVal;

  RobotType(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
