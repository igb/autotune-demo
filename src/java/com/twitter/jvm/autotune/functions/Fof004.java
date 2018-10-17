import java.awt.geom.*;

public class Fof004 {
	public static Point2D.Double[] points = {
		new Point2D.Double(-215.101562, -15.421875),
		new Point2D.Double(-207.387500, -10.593750),
		new Point2D.Double(-202.703125, -2.882812),
		new Point2D.Double(-198.182813, 4.345313),
		new Point2D.Double(-195.328125, 6.157813),
		new Point2D.Double(-188.401563, 2.403125),
		new Point2D.Double(-179.678125, -5.842187),
		new Point2D.Double(-177.662500, -7.681250),
		new Point2D.Double(-177.570312, -7.681250),
		new Point2D.Double(-159.990625, 0.653125),
		new Point2D.Double(-148.082812, 5.012500),
		new Point2D.Double(-138.956250, 5.323437),
		new Point2D.Double(-131.590625, 4.610938),
		new Point2D.Double(-124.300000, 1.246875),
		new Point2D.Double(-123.115625, 0.323437),
		new Point2D.Double(-122.645313, 0.512500),
		new Point2D.Double(-109.548438, 7.139062),
		new Point2D.Double(-94.737500, 10.057813),
		new Point2D.Double(-87.535938, 8.990625),
		new Point2D.Double(-83.532813, 5.507812),
		new Point2D.Double(-78.690625, 1.110937),
		new Point2D.Double(-77.404687, 0.053125),
		new Point2D.Double(-76.934375, 0.053125),
		new Point2D.Double(-56.012500, 0.010937),
		new Point2D.Double(-39.046875, -4.082813),
		new Point2D.Double(-33.221875, -6.665625),
		new Point2D.Double(-33.118750, -6.665625),
		new Point2D.Double(-32.932812, -6.665625),
		new Point2D.Double(-17.937500, -4.128125),
		new Point2D.Double(-3.390625, -3.590625),
		new Point2D.Double(5.920312, -3.884375),
		new Point2D.Double(9.285937, -4.031250),
		new Point2D.Double(9.378125, -4.031250),
		new Point2D.Double(24.651563, -2.000000),
		new Point2D.Double(39.389063, -1.818750),
		new Point2D.Double(47.239063, -1.818750),
		new Point2D.Double(47.342188, -1.818750),
		new Point2D.Double(47.528125, -1.818750),
		new Point2D.Double(70.312500, 1.245313),
		new Point2D.Double(92.315625, 0.878125),
		new Point2D.Double(103.967187, -0.846875),
		new Point2D.Double(105.929688, -0.051562),
		new Point2D.Double(106.021875, -0.051562),
		new Point2D.Double(120.871875, 1.628125),
		new Point2D.Double(131.903125, 3.264063),
		new Point2D.Double(143.062500, 6.978125),
		new Point2D.Double(152.456250, 10.665625),
		new Point2D.Double(159.295312, 17.782812),
		new Point2D.Double(159.907813, 19.140625),
		new Point2D.Double(160.375000, 19.328125),
		new Point2D.Double(169.646875, 26.820312),
		new Point2D.Double(176.403125, 34.882812),
		new Point2D.Double(182.442187, 44.825000),
		new Point2D.Double(189.845313, 59.376562),
		new Point2D.Double(196.695312, 73.787500),
		new Point2D.Double(197.304688, 75.645313),
		new Point2D.Double(197.584375, 75.926563),
		new Point2D.Double(204.628125, 85.978125),
		new Point2D.Double(209.089063, 97.746875),
		new Point2D.Double(213.487500, 109.681250),
		new Point2D.Double(215.670312, 119.837500),
		new Point2D.Double(216.829688, 127.385937),
		new Point2D.Double(217.743750, 132.356250),
		new Point2D.Double(219.343750, 140.510938),
		new Point2D.Double(220.893750, 144.160937),
		new Point2D.Double(220.996875, 146.662500),
		new Point2D.Double(221.092187, 147.162500),
		new Point2D.Double(221.189063, 147.260938),
		new Point2D.Double(221.714063, 148.495313),
		new Point2D.Double(221.806250, 148.495313),
		new Point2D.Double(222.725000, 148.082812),
		new Point2D.Double(223.142188, 145.789062),
		new Point2D.Double(223.276563, 104.831250),
		new Point2D.Double(231.121875, 37.718750),
		new Point2D.Double(231.825000, 35.789062),
		new Point2D.Double(235.098437, 20.553125),
		new Point2D.Double(243.485938, 3.812500),
		new Point2D.Double(248.014062, -2.212500),
		new Point2D.Double(248.025000, -2.418750),
	};

	public static Double interpolate(Double x, Point2D.Double a, Point2D.Double b) {
		return a.y + ((b.y - a.y) *   ((x - a.x) / (b.x - a.x)));
	}

	public static Point2D.Double findA(Double x, Point2D.Double[] points) {
		Point2D.Double a = null;
		for (int i = 0; i < points.length; i++) {
			if (points[i].x > x) {
				return a;

			} else {
				a = points[i];
			}

		}
		return a;
	}

	public static Point2D.Double findB(Double x, Point2D.Double[] points) {
		for (int i = 0; i < points.length; i++) {
			if (points[i].x > x) {
				return points[i];
			}
		
		}
		return null;
	}

	public static void main(String[] args) {
		Double x = Double.parseDouble(args[0]);
		Point2D.Double a = findA(x, points);
		Point2D.Double b = findB(x, points);
		Double y = interpolate(x, a, b);
		System.out.println(y);
	}

}
