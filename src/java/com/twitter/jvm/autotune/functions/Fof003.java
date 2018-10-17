import java.awt.geom.*;

public class Fof003 {
	public static Point2D.Double[] points = {
		new Point2D.Double(-111.292187, -12.529687),
		new Point2D.Double(-110.371875, -12.529687),
		new Point2D.Double(-108.100781, -11.444531),
		new Point2D.Double(-106.151562, -9.653906),
		new Point2D.Double(-103.536719, -6.525781),
		new Point2D.Double(-100.163281, -1.096875),
		new Point2D.Double(-95.825000, 7.089844),
		new Point2D.Double(-89.310156, 18.137500),
		new Point2D.Double(-86.323437, 22.752344),
		new Point2D.Double(-84.203906, 26.033594),
		new Point2D.Double(-83.465625, 30.173437),
		new Point2D.Double(-80.124219, 40.332813),
		new Point2D.Double(-76.792187, 51.081250),
		new Point2D.Double(-75.437500, 55.336719),
		new Point2D.Double(-74.812500, 56.699219),
		new Point2D.Double(-74.410156, 58.450000),
		new Point2D.Double(-73.536719, 61.915625),
		new Point2D.Double(-73.226562, 63.807031),
		new Point2D.Double(-72.861719, 65.650781),
		new Point2D.Double(-72.725781, 66.659375),
		new Point2D.Double(-72.678125, 69.317188),
		new Point2D.Double(-72.507031, 69.807812),
		new Point2D.Double(-72.342187, 70.140625),
		new Point2D.Double(-72.291406, 70.244531),
		new Point2D.Double(-72.244531, 70.292969),
		new Point2D.Double(-71.692188, 56.349219),
		new Point2D.Double(-69.175000, 45.546094),
		new Point2D.Double(-64.460156, 33.572656),
		new Point2D.Double(-61.383594, 25.833594),
		new Point2D.Double(-60.536719, 23.498438),
		new Point2D.Double(-59.971094, 21.398438),
		new Point2D.Double(-57.945312, 17.164062),
		new Point2D.Double(-55.566406, 14.096094),
		new Point2D.Double(-51.773438, 10.110156),
		new Point2D.Double(-50.053906, 8.017188),
		new Point2D.Double(-49.430469, 7.393750),
		new Point2D.Double(-48.147656, 6.679688),
		new Point2D.Double(-46.450781, 5.911719),
		new Point2D.Double(-44.979687, 5.471094),
		new Point2D.Double(-43.698437, 5.403125),
		new Point2D.Double(-42.319531, 5.403125),
		new Point2D.Double(-40.633594, 5.556250),
		new Point2D.Double(-39.623438, 5.921875),
		new Point2D.Double(-38.245312, 6.428906),
		new Point2D.Double(-36.652344, 6.588281),
		new Point2D.Double(-34.703906, 6.588281),
		new Point2D.Double(-32.433594, 6.335156),
		new Point2D.Double(-30.842188, 5.877344),
		new Point2D.Double(-29.923437, 5.549219),
		new Point2D.Double(-29.821094, 5.497656),
		new Point2D.Double(-29.633594, 5.497656),
		new Point2D.Double(-24.717969, 5.497656),
		new Point2D.Double(-12.121875, 4.742969),
		new Point2D.Double(-1.347656, 1.317969),
		new Point2D.Double(4.102344, -0.605469),
		new Point2D.Double(7.213281, -1.608594),
		new Point2D.Double(7.503125, -1.556250),
		new Point2D.Double(7.596094, -1.556250),
		new Point2D.Double(9.510938, -1.391406),
		new Point2D.Double(13.436719, -0.367188),
		new Point2D.Double(15.848437, 0.223438),
		new Point2D.Double(19.079687, 0.744531),
		new Point2D.Double(21.587500, 0.920312),
		new Point2D.Double(23.739844, 0.920312),
		new Point2D.Double(26.150781, 0.920312),
		new Point2D.Double(28.132812, 0.773438),
		new Point2D.Double(30.039844, 0.773438),
		new Point2D.Double(31.728906, 0.773438),
		new Point2D.Double(33.011719, 0.773438),
		new Point2D.Double(33.369531, 0.945312),
		new Point2D.Double(33.509375, 0.945312),
		new Point2D.Double(36.421094, 2.117969),
		new Point2D.Double(45.993750, 3.892187),
		new Point2D.Double(52.231250, 3.994531),
		new Point2D.Double(57.484375, 3.780469),
		new Point2D.Double(60.458594, 3.057031),
		new Point2D.Double(62.051563, 2.524219),
		new Point2D.Double(62.813281, 2.274219),
		new Point2D.Double(63.028906, 2.217969),
		new Point2D.Double(63.360156, 2.265625),
		new Point2D.Double(66.979687, 3.340625),
		new Point2D.Double(74.944531, 4.525781),
		new Point2D.Double(81.678125, 4.650000),
		new Point2D.Double(86.226562, 4.241406),
		new Point2D.Double(88.758594, 3.993750),
		new Point2D.Double(89.299219, 3.993750),
		new Point2D.Double(89.533594, 3.993750),
		new Point2D.Double(91.340625, 3.993750),
		new Point2D.Double(95.468750, 3.993750),
		new Point2D.Double(97.832813, 3.661719),
		new Point2D.Double(100.440625, 3.385937),
		new Point2D.Double(102.033594, 3.160156),
		new Point2D.Double(103.589062, 2.809375),
		new Point2D.Double(104.151562, 2.684375),
		new Point2D.Double(104.265625, 2.684375),
		new Point2D.Double(104.732812, 2.627344),
		new Point2D.Double(105.187500, 2.570312),
		new Point2D.Double(105.643750, 2.570312),
		new Point2D.Double(106.100000, 2.570312),
		new Point2D.Double(106.493750, 2.570312),
		new Point2D.Double(106.949219, 2.514063),
		new Point2D.Double(107.342969, 2.457031),
		new Point2D.Double(107.849219, 2.457031),
		new Point2D.Double(108.180469, 2.457031),
		new Point2D.Double(108.385156, 2.457031),
		new Point2D.Double(108.485156, 2.457031),
		new Point2D.Double(108.635937, 2.457031),
		new Point2D.Double(108.967187, 2.400000),
		new Point2D.Double(109.298438, 2.342969),
		new Point2D.Double(109.398438, 2.342969),
		new Point2D.Double(109.725000, 2.342969),
		new Point2D.Double(110.181250, 2.342969),
		new Point2D.Double(110.637500, 2.342969),
		new Point2D.Double(110.906250, 2.342969),
		new Point2D.Double(110.957813, 2.342969),
		new Point2D.Double(111.004688, 2.342969),
		new Point2D.Double(111.102344, 2.342969),
		new Point2D.Double(111.703125, 2.342969),
		new Point2D.Double(112.306250, 2.342969),
		new Point2D.Double(112.575000, 2.291406),
		new Point2D.Double(112.626563, 2.291406),
		new Point2D.Double(112.828125, 2.291406),
		new Point2D.Double(113.159375, 2.239844),
		new Point2D.Double(113.364844, 2.136719),
		new Point2D.Double(113.519531, 2.136719),
		new Point2D.Double(113.565625, 2.136719),
		new Point2D.Double(113.771875, 2.033594),
		new Point2D.Double(113.823437, 2.033594),
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
