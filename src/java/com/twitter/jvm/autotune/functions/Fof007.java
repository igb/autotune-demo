package com.twitter.jvm.autotune.functions;

import com.twitter.jvm.autotune.Function;

import java.awt.geom.*;

public class Fof007  implements Function {
	public static Point2D.Double[] points = {
				new Point2D.Double(-271.634375, 164.232812),
		new Point2D.Double(-269.793750, 164.232812),
		new Point2D.Double(-266.889063, 163.950000),
		new Point2D.Double(-264.165625, 163.275000),
		new Point2D.Double(-262.700000, 162.742188),
		new Point2D.Double(-260.873438, 162.223437),
		new Point2D.Double(-259.042188, 161.704688),
		new Point2D.Double(-257.748438, 161.320312),
		new Point2D.Double(-256.829687, 161.059375),
		new Point2D.Double(-255.712500, 160.687500),
		new Point2D.Double(-254.739062, 160.325000),
		new Point2D.Double(-253.460938, 159.945312),
		new Point2D.Double(-251.996875, 159.685937),
		new Point2D.Double(-249.829688, 159.145312),
		new Point2D.Double(-248.740625, 158.873437),
		new Point2D.Double(-246.912500, 158.454688),
		new Point2D.Double(-245.457812, 157.925000),
		new Point2D.Double(-243.478125, 157.148438),
		new Point2D.Double(-241.642188, 156.231250),
		new Point2D.Double(-238.878125, 154.925000),
		new Point2D.Double(-236.276563, 153.551562),
		new Point2D.Double(-233.412500, 151.865625),
		new Point2D.Double(-229.921875, 149.773438),
		new Point2D.Double(-226.385938, 147.659375),
		new Point2D.Double(-224.606250, 146.707812),
		new Point2D.Double(-221.615625, 144.921875),
		new Point2D.Double(-220.104688, 143.957812),
		new Point2D.Double(-219.398438, 143.490625),
		new Point2D.Double(-219.193750, 143.285937),
		new Point2D.Double(-219.009375, 143.285937),
		new Point2D.Double(-218.034375, 143.173438),
		new Point2D.Double(-216.364062, 142.537500),
		new Point2D.Double(-215.443750, 142.140625),
		new Point2D.Double(-214.165625, 141.504687),
		new Point2D.Double(-212.881250, 140.740625),
		new Point2D.Double(-211.590625, 139.971875),
		new Point2D.Double(-209.356250, 138.571875),
		new Point2D.Double(-208.220313, 137.857812),
		new Point2D.Double(-206.304688, 136.679688),
		new Point2D.Double(-204.550000, 135.365625),
		new Point2D.Double(-202.679688, 134.356250),
		new Point2D.Double(-200.865625, 133.523438),
		new Point2D.Double(-197.943750, 132.646875),
		new Point2D.Double(-194.781250, 131.740625),
		new Point2D.Double(-192.028125, 130.868750),
		new Point2D.Double(-190.026563, 130.442187),
		new Point2D.Double(-187.362500, 129.979688),
		new Point2D.Double(-185.267188, 129.495313),
		new Point2D.Double(-180.407813, 128.457812),
		new Point2D.Double(-175.551562, 127.148438),
		new Point2D.Double(-172.095313, 126.189063),
		new Point2D.Double(-168.971875, 125.221875),
		new Point2D.Double(-167.270312, 124.779687),
		new Point2D.Double(-167.167188, 124.779687),
		new Point2D.Double(-166.793750, 124.779687),
		new Point2D.Double(-162.289062, 124.779687),
		new Point2D.Double(-147.993750, 122.600000),
		new Point2D.Double(-131.915625, 119.659375),
		new Point2D.Double(-112.090625, 116.546875),
		new Point2D.Double(-89.296875, 111.157813),
		new Point2D.Double(-78.751563, 107.643750),
		new Point2D.Double(-67.000000, 103.145313),
		new Point2D.Double(-57.239063, 98.637500),
		new Point2D.Double(-51.621875, 96.051563),
		new Point2D.Double(-50.509375, 95.779687),
		new Point2D.Double(-50.178125, 95.665625),
		new Point2D.Double(-49.993750, 95.665625),
		new Point2D.Double(-45.323437, 95.870312),
		new Point2D.Double(-38.690625, 96.909375),
		new Point2D.Double(-24.821875, 98.025000),
		new Point2D.Double(-7.334375, 98.025000),
		new Point2D.Double(15.729688, 97.417187),
		new Point2D.Double(22.553125, 96.165625),
		new Point2D.Double(33.139063, 93.703125),
		new Point2D.Double(40.959375, 91.470313),
		new Point2D.Double(44.518750, 90.282813),
		new Point2D.Double(46.578125, 89.723438),
		new Point2D.Double(46.679688, 89.723438),
		new Point2D.Double(47.342188, 89.723438),
		new Point2D.Double(53.073437, 89.723438),
		new Point2D.Double(64.284375, 89.723438),
		new Point2D.Double(82.725000, 86.976562),
		new Point2D.Double(95.790625, 84.579688),
		new Point2D.Double(107.232812, 81.757812),
		new Point2D.Double(118.704688, 78.196875),
		new Point2D.Double(124.757812, 76.170312),
		new Point2D.Double(126.414062, 75.618750),
		new Point2D.Double(128.671875, 74.870312),
		new Point2D.Double(128.856250, 74.870312),
		new Point2D.Double(131.729688, 74.204688),
		new Point2D.Double(138.590625, 72.096875),
		new Point2D.Double(153.423438, 68.309375),
		new Point2D.Double(165.593750, 66.439063),
		new Point2D.Double(179.789062, 64.395313),
		new Point2D.Double(183.910937, 63.514063),
		new Point2D.Double(185.600000, 63.050000),
		new Point2D.Double(186.201562, 62.812500),
		new Point2D.Double(186.479688, 62.626562),
		new Point2D.Double(189.190625, 60.518750),
		new Point2D.Double(194.189063, 56.632812),
		new Point2D.Double(200.362500, 52.570312),
		new Point2D.Double(207.159375, 49.368750),
		new Point2D.Double(218.945312, 46.518750),
		new Point2D.Double(230.134375, 44.495312),
		new Point2D.Double(236.890625, 42.950000),
		new Point2D.Double(239.768750, 42.157812),
		new Point2D.Double(240.645312, 42.021875),
		new Point2D.Double(240.737500, 41.743750),
		new Point2D.Double(242.854688, 39.307812),
		new Point2D.Double(245.968750, 36.342188),
		new Point2D.Double(249.125000, 33.707813),
		new Point2D.Double(250.689063, 32.587500),
		new Point2D.Double(251.707812, 31.739062),
		new Point2D.Double(254.760938, 29.542188),
		new Point2D.Double(256.154688, 28.612500),
		new Point2D.Double(258.895312, 27.021875),
		new Point2D.Double(260.357813, 26.354688),
		new Point2D.Double(260.814062, 26.126562),
		new Point2D.Double(261.123438, 26.126562),
		new Point2D.Double(261.307813, 26.126562),
		new Point2D.Double(262.501562, 25.434375),
		new Point2D.Double(265.328125, 23.646875),
		new Point2D.Double(267.246875, 22.467188),
		new Point2D.Double(268.337500, 21.923437),
		new Point2D.Double(271.121875, 20.239062),
		new Point2D.Double(273.151563, 19.020312),
		new Point2D.Double(274.496875, 18.287500),
		new Point2D.Double(275.429688, 17.718750),
		new Point2D.Double(276.339063, 17.264063),
		new Point2D.Double(276.895312, 16.934375),
		new Point2D.Double(277.659375, 16.501562),
		new Point2D.Double(278.092188, 16.284375),
		new Point2D.Double(278.423437, 16.181250),
		new Point2D.Double(278.629687, 16.078125),
		new Point2D.Double(278.725000, 16.078125),
		new Point2D.Double(278.818750, 15.982812),
		new Point2D.Double(279.126562, 15.776563),
		new Point2D.Double(279.810938, 15.434375),
		new Point2D.Double(280.239062, 15.221875),
		new Point2D.Double(280.546875, 15.017188),
		new Point2D.Double(280.648438, 14.915625),
		new Point2D.Double(280.746875, 14.915625),
		new Point2D.Double(280.839063, 14.637500),
		new Point2D.Double(281.496875, 14.206250),
		new Point2D.Double(281.904688, 13.900000),
		new Point2D.Double(282.001562, 13.803125),
		new Point2D.Double(282.093750, 13.710938),
		new Point2D.Double(282.646875, 13.382812),
		new Point2D.Double(283.462500, 12.809375),
		new Point2D.Double(284.475000, 12.137500),
		new Point2D.Double(284.884375, 11.829688),
		new Point2D.Double(284.987500, 11.829688),
		new Point2D.Double(285.079687, 11.829688),
		new Point2D.Double(285.512500, 11.715625),
		new Point2D.Double(286.150000, 11.500000),
		new Point2D.Double(286.456250, 11.396875),
		new Point2D.Double(286.550000, 11.396875),
		new Point2D.Double(286.642187, 11.396875),
		new Point2D.Double(286.734375, 11.396875)

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
