package me.puneet.operator.overloading;
/**
 * Reference is R programming
 */
public class Vec {
	   private float x, y, z;

	   public Vec(float x, float y, float z) {
	       this.x = x;
	       this.y = y;
	       this.z = z;
	   }

	   public Vec plus(Vec other) {
	       return new Vec(x + other.x, y + other.y, z + other.z);
	   }
	   
	   public Vec plus(float other) {
		    return new Vec(x + other, y + other, z + other);
		}

	}

