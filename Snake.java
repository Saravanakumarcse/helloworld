import java.awt.Color;
  import java.awt.Graphics2D;
  import java.awt.Rectangle;
  import java.util.ArrayList;

 public class Snake {
private int x;
private int y;
private int r;

int body;
Rectangle rectangle;
ArrayList<Rectangle> rc = new ArrayList<Rectangle>();
private boolean left;
private boolean right;
private boolean up;
private boolean down;

public Snake() {
x = 150;
y = 150;
r = 4;
  body = 3;
  for (int i = 0; i < body; i++) {
rc.add(new Rectangle(x - i * r * 3, y, r * 3, r * 3));
  }
}

public void draw(Graphics2D g) {

  for (int i = 0; i < body; i++) {
  if (i == 0) {
  g.setColor(Color.red);
  } else {
  g.setColor(Color.green);
  }
  g.fillOval(rc.get(i).x, rc.get(i).y, rc.get(i).width,
  rc.get(i).height);
  }
}

public void update() {
  for (int i = body; i > 0; i--) {
  rc.set(i, rc.get(i - 1));
  }
  if (left) {
  rc.get(0).x -= 1;
  System.out.println("vbnv");
  }
  if (right) {
  rc.get(0).x += 1;
  }
  if (up) {
  rc.get(0).y -= 1;
  }
  if (down) {
  rc.get(0).y += 1;
  }
}

public void setLeft(boolean b) {
  left = b;
}

public void setRight(boolean b) {
right = b;
}

public void setUp(boolean b) {
 up = b;
}

public void setDown(boolean b) {
  down = b;
}

   }
