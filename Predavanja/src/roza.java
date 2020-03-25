/**
 *
 * @author Tim
 */
public class roza {
     double x, y ;
	String state = "happy" ;
	double petalRadius = 0.013 ;
	
	public void Flower()
	{
		x = y = 0.5 ;
		state = "happy" ;
	}
	
	public void Flower(double inx, double iny){
		x = inx ;
		y = iny ;
		state = "happy" ;
	}
	
	public void setSad()
	{
		state = "sad" ;
	}
	
	public void setHappy()
	{
		state = "happy" ;
	}
	
	public double getX() { return x ; }
	public double getY() { return y ; }
	
	public void draw()
	{
		if (state.equals("happy") ) 
		{
			StdDraw.setPenColor(StdDraw.YELLOW) ;
		}
		else
		{
			StdDraw.setPenColor(StdDraw.GRAY) ;
		}
		
		StdDraw.filledCircle(x + 0.03, y, petalRadius) ;
		StdDraw.filledCircle(x + 0.02, y+0.02, petalRadius) ;
		StdDraw.filledCircle(x , y+0.03, petalRadius) ;			
		StdDraw.filledCircle(x - 0.02, y+0.02, petalRadius) ;
		StdDraw.filledCircle(x - 0.03, y, petalRadius) ;
		StdDraw.filledCircle(x - 0.02, y-0.02, petalRadius) ;
		StdDraw.filledCircle(x , y-0.03, petalRadius) ;
		StdDraw.filledCircle(x + 0.02, y-0.02, petalRadius) ;
		
		StdDraw.setPenColor(StdDraw.BLACK) ;
		StdDraw.filledCircle(x , y, petalRadius) ;
			
		
		
	}
        
        public static void main(String[] args){
            draw();
        }

}
