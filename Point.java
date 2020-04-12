class Point {
	String id
	double x,y;
    String color

	public String getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getY() {
		return y;
	}

	public String getColor() {
		return color;
	}

	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

//TODO constructor

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}



}