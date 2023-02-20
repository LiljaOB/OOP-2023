package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
	ArrayList<Star> stars = new ArrayList<Star>();

	float border;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		
		smooth();
	}
	
	void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

	void makeStars()
	{
		for(Star s:stars)
		{
			System.out.println(s);
		}
	}

	void drawStars()
	{
		for(Star s:stars)
		{
			s.render(this);
		}
	}

	public void drawGrid()
	{
		stroke(255);
		float border = 50.0f;

		int count = 10;
		float gap = (width - (border * 2.0f)) / (float) count;
		for(int i = -5 ; i <= 5 ; i ++)
		{
			float x = border + (gap * (i + 5));
			line(x, border, x, height - border);
			line(border, x, width - border, x);
		}
		
	}
		
	public void draw()
	{	
		strokeWeight(2);		

		drawGrid();
	}

	public void start()
	{
		colorMode(RGB);
		loadStars();
		

		border = width * 0.1f;
	}
}
