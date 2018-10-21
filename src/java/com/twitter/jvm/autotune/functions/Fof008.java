package com.twitter.jvm.autotune.functions;

import java.awt.geom.*;

public class Fof008 {
	public static Point2D.Double[] points = {
		new Point2D.Double(-489.450000, -303.475000),
		new Point2D.Double(-481.265625, -300.403125),
		new Point2D.Double(-473.825000, -295.468750),
		new Point2D.Double(-470.200000, -292.268750),
		new Point2D.Double(-466.006250, -289.012500),
		new Point2D.Double(-461.615625, -285.343750),
		new Point2D.Double(-455.209375, -279.118750),
		new Point2D.Double(-447.440625, -270.040625),
		new Point2D.Double(-435.493750, -258.062500),
		new Point2D.Double(-426.675000, -248.896875),
		new Point2D.Double(-416.953125, -238.193750),
		new Point2D.Double(-401.131250, -222.640625),
		new Point2D.Double(-378.306250, -196.512500),
		new Point2D.Double(-370.171875, -183.612500),
		new Point2D.Double(-364.034375, -172.790625),
		new Point2D.Double(-358.300000, -163.356250),
		new Point2D.Double(-351.465625, -153.771875),
		new Point2D.Double(-344.471875, -144.412500),
		new Point2D.Double(-337.375000, -132.015625),
		new Point2D.Double(-329.931250, -121.268750),
		new Point2D.Double(-322.465625, -112.031250),
		new Point2D.Double(-316.465625, -102.950000),
		new Point2D.Double(-316.053125, -102.531250),
		new Point2D.Double(-310.012500, -88.137500),
		new Point2D.Double(-302.328125, -74.875000),
		new Point2D.Double(-297.584375, -65.681250),
		new Point2D.Double(-295.150000, -59.990625),
		new Point2D.Double(-291.587500, -53.337500),
		new Point2D.Double(-288.196875, -46.743750),
		new Point2D.Double(-284.378125, -39.775000),
		new Point2D.Double(-281.581250, -35.906250),
		new Point2D.Double(-276.359375, -21.665625),
		new Point2D.Double(-270.956250, -6.196875),
		new Point2D.Double(-263.575000, 12.721875),
		new Point2D.Double(-255.034375, 30.900000),
		new Point2D.Double(-244.115625, 48.525000),
		new Point2D.Double(-242.503125, 51.471875),
		new Point2D.Double(-238.028125, 65.890625),
		new Point2D.Double(-226.837500, 87.096875),
		new Point2D.Double(-211.340625, 118.050000),
		new Point2D.Double(-195.218750, 143.534375),
		new Point2D.Double(-183.706250, 159.075000),
		new Point2D.Double(-178.800000, 173.934375),
		new Point2D.Double(-166.415625, 196.887500),
		new Point2D.Double(-153.259375, 218.684375),
		new Point2D.Double(-141.421875, 233.609375),
		new Point2D.Double(-138.390625, 236.446875),
		new Point2D.Double(-130.096875, 248.525000),
		new Point2D.Double(-124.596875, 256.525000),
		new Point2D.Double(-115.612500, 266.359375),
		new Point2D.Double(-103.834375, 277.959375),
		new Point2D.Double(-101.065625, 280.415625),
		new Point2D.Double(-100.509375, 280.603125),
		new Point2D.Double(-95.506250, 284.459375),
		new Point2D.Double(-91.818750, 287.468750),
		new Point2D.Double(-86.968750, 291.153125),
		new Point2D.Double(-80.500000, 295.759375),
		new Point2D.Double(-74.671875, 299.900000),
		new Point2D.Double(-72.228125, 301.468750),
		new Point2D.Double(-71.815625, 301.468750),
		new Point2D.Double(-71.446875, 301.468750),
		new Point2D.Double(-66.368750, 303.153125),
		new Point2D.Double(-60.690625, 305.618750),
		new Point2D.Double(-55.025000, 306.856250),
		new Point2D.Double(-50.587500, 307.781250),
		new Point2D.Double(-47.937500, 308.871875),
		new Point2D.Double(-46.040625, 309.290625),
		new Point2D.Double(-44.346875, 309.290625),
		new Point2D.Double(-42.696875, 309.290625),
		new Point2D.Double(-40.553125, 309.290625),
		new Point2D.Double(-38.159375, 309.290625),
		new Point2D.Double(-36.515625, 309.290625),
		new Point2D.Double(-33.746875, 309.962500),
		new Point2D.Double(-31.143750, 311.028125),
		new Point2D.Double(-29.509375, 311.446875),
		new Point2D.Double(-26.118750, 312.340625),
		new Point2D.Double(-21.890625, 312.825000),
		new Point2D.Double(-18.656250, 312.328125),
		new Point2D.Double(-18.287500, 312.328125),
		new Point2D.Double(-12.734375, 312.328125),
		new Point2D.Double(-10.106250, 312.328125),
		new Point2D.Double(-8.215625, 312.328125),
		new Point2D.Double(-6.065625, 312.328125),
		new Point2D.Double(-4.165625, 312.328125),
		new Point2D.Double(-1.015625, 312.328125),
		new Point2D.Double(1.428125, 312.328125),
		new Point2D.Double(3.784375, 312.328125),
		new Point2D.Double(5.212500, 312.328125),
		new Point2D.Double(5.993750, 312.328125),
		new Point2D.Double(7.178125, 312.328125),
		new Point2D.Double(7.971875, 312.328125),
		new Point2D.Double(10.115625, 311.484375),
		new Point2D.Double(13.806250, 309.662500),
		new Point2D.Double(17.534375, 307.159375),
		new Point2D.Double(18.425000, 305.587500),
		new Point2D.Double(18.609375, 305.587500),
		new Point2D.Double(24.028125, 303.712500),
		new Point2D.Double(29.331250, 298.659375),
		new Point2D.Double(37.675000, 292.390625),
		new Point2D.Double(52.978125, 284.878125),
		new Point2D.Double(62.687500, 276.806250),
		new Point2D.Double(63.306250, 276.187500),
		new Point2D.Double(69.831250, 260.425000),
		new Point2D.Double(80.381250, 245.021875),
		new Point2D.Double(88.462500, 232.468750),
		new Point2D.Double(90.231250, 227.262500),
		new Point2D.Double(108.518750, 198.290625),
		new Point2D.Double(138.615625, 156.318750),
		new Point2D.Double(152.425000, 136.268750),
		new Point2D.Double(153.803125, 133.300000),
		new Point2D.Double(165.365625, 102.925000),
		new Point2D.Double(184.328125, 67.825000),
		new Point2D.Double(198.103125, 45.334375),
		new Point2D.Double(201.415625, 37.496875),
		new Point2D.Double(209.137500, 14.115625),
		new Point2D.Double(238.975000, -25.503125),
		new Point2D.Double(260.334375, -53.990625),
		new Point2D.Double(265.840625, -63.065625),
		new Point2D.Double(288.887500, -104.818750),
		new Point2D.Double(329.059375, -153.328125),
		new Point2D.Double(354.181250, -185.856250),
		new Point2D.Double(359.271875, -194.262500),
		new Point2D.Double(367.925000, -206.846875),
		new Point2D.Double(390.350000, -236.818750),
		new Point2D.Double(428.350000, -279.246875),
		new Point2D.Double(438.790625, -289.643750),
		new Point2D.Double(438.975000, -289.643750),
		new Point2D.Double(454.921875, -295.071875),
		new Point2D.Double(471.684375, -302.918750),
		new Point2D.Double(483.118750, -309.065625),
		new Point2D.Double(497.421875, -315.734375),
		new Point2D.Double(499.271875, -316.350000),
		new Point2D.Double(509.987500, -320.000000),
		new Point2D.Double(517.690625, -323.468750),
		new Point2D.Double(523.390625, -327.171875),
		new Point2D.Double(526.262500, -330.009375),
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

	public Double getYforX(Double x) {
		Point2D.Double a = findA(x, points);
		Point2D.Double b = findB(x, points);
		return interpolate(x, a, b);
	}

	public static void main(String[] args) {
		Double x = Double.parseDouble(args[0]);
		Point2D.Double a = findA(x, points);
		Point2D.Double b = findB(x, points);
		Double y = interpolate(x, a, b);
		System.out.println(y);
	}

}
