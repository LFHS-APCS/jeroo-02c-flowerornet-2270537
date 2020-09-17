/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().loadMap("maps/flowerOrNet.jev");
        new JerooGUI();
        runJerooCode();

    }

    /**
     * You can change which tests you are running here.
     */
    public static void runJerooCode() {
        TestMain test = new TestMain();
        test.setup();
        test.test1_flowerOrNet();

public boolean isFlowerOrNetNearInFront() {
      if (isClear(AHEAD))
      hop();
      if (isFlower(AHEAD))
      else if (isNet(AHEAD))
      turn(LEFT);
      turn(LEFT);
      hop();
      turn(LEFT);
      turn(LEFT);
      return true;
if (isClear(AHEAD))
      hop();
      if (!isFlower(AHEAD))
      else if (!isNet(AHEAD))
      turn(LEFT);
      turn(LEFT);
      hop();
      turn(LEFT);
      turn(LEFT);
        return false;
    }
    }

}
