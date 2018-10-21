package com.twitter.jvm.autotune.functions;

import com.twitter.jvm.autotune.Function;

import java.awt.geom.*;

public class Fof007 implements Function {
	public static Point2D.Double[] points = {
		new Point2D.Double(-247.334375, 154.896875),
		new Point2D.Double(-244.993750, 154.771875),
		new Point2D.Double(-241.910937, 154.234375),
		new Point2D.Double(-238.432813, 153.664062),
		new Point2D.Double(-235.706250, 152.951562),
		new Point2D.Double(-232.814063, 151.862500),
		new Point2D.Double(-230.818750, 151.065625),
		new Point2D.Double(-228.271875, 150.237500),
		new Point2D.Double(-224.609375, 148.920312),
		new Point2D.Double(-222.079688, 147.942187),
		new Point2D.Double(-219.373437, 146.860938),
		new Point2D.Double(-217.184375, 145.973437),
		new Point2D.Double(-216.648438, 145.551562),
		new Point2D.Double(-214.300000, 144.585938),
		new Point2D.Double(-210.756250, 143.107812),
		new Point2D.Double(-204.592187, 140.703125),
		new Point2D.Double(-194.860938, 136.010938),
		new Point2D.Double(-180.390625, 127.573437),
		new Point2D.Double(-169.575000, 120.737500),
		new Point2D.Double(-158.918750, 111.614063),
		new Point2D.Double(-154.562500, 106.950000),
		new Point2D.Double(-153.950000, 105.642188),
		new Point2D.Double(-148.585938, 104.807812),
		new Point2D.Double(-141.982812, 102.914062),
		new Point2D.Double(-129.739062, 98.573437),
		new Point2D.Double(-113.403125, 91.215625),
		new Point2D.Double(-100.790625, 83.437500),
		new Point2D.Double(-92.200000, 76.607812),
		new Point2D.Double(-86.610938, 71.676563),
		new Point2D.Double(-84.975000, 70.154687),
		new Point2D.Double(-84.643750, 69.823437),
		new Point2D.Double(-82.346875, 69.006250),
		new Point2D.Double(-69.331250, 61.139063),
		new Point2D.Double(-56.396875, 52.296875),
		new Point2D.Double(-47.157812, 45.750000),
		new Point2D.Double(-39.645313, 39.253125),
		new Point2D.Double(-36.453125, 35.721875),
		new Point2D.Double(-34.890625, 33.354687),
		new Point2D.Double(-33.746875, 29.385938),
		new Point2D.Double(-29.331250, 21.137500),
		new Point2D.Double(-24.982813, 14.214063),
		new Point2D.Double(-20.573438, 8.450000),
		new Point2D.Double(-14.785937, 1.907812),
		new Point2D.Double(-9.331250, -3.210938),
		new Point2D.Double(-5.742188, -6.007812),
		new Point2D.Double(-3.065625, -7.854687),
		new Point2D.Double(-2.403125, -8.185937),
		new Point2D.Double(0.239063, -13.501563),
		new Point2D.Double(5.234375, -19.218750),
		new Point2D.Double(13.521875, -26.520312),
		new Point2D.Double(24.125000, -35.685938),
		new Point2D.Double(33.456250, -43.125000),
		new Point2D.Double(40.676563, -49.520313),
		new Point2D.Double(44.637500, -53.812500),
		new Point2D.Double(45.960938, -55.409375),
		new Point2D.Double(46.073437, -55.965625),
		new Point2D.Double(46.353125, -56.432812),
		new Point2D.Double(55.934375, -68.004688),
		new Point2D.Double(74.125000, -88.518750),
		new Point2D.Double(88.428125, -103.729687),
		new Point2D.Double(102.098438, -116.687500),
		new Point2D.Double(109.943750, -122.209375),
		new Point2D.Double(114.403125, -125.489063),
		new Point2D.Double(114.898438, -126.065625),
		new Point2D.Double(115.367188, -126.065625),
		new Point2D.Double(119.864063, -126.920312),
		new Point2D.Double(136.400000, -133.643750),
		new Point2D.Double(153.014062, -141.117188),
		new Point2D.Double(165.496875, -147.360938),
		new Point2D.Double(172.303125, -150.931250),
		new Point2D.Double(173.975000, -151.806250),
		new Point2D.Double(174.139062, -151.806250),
		new Point2D.Double(179.126563, -151.806250),
		new Point2D.Double(189.225000, -152.843750),
		new Point2D.Double(200.542188, -155.571875),
		new Point2D.Double(210.826562, -157.770312),
		new Point2D.Double(218.940625, -159.618750),
		new Point2D.Double(224.154687, -160.584375),
		new Point2D.Double(225.464063, -160.709375),
		new Point2D.Double(225.635938, -160.507812),
		new Point2D.Double(229.001563, -159.320312),
		new Point2D.Double(233.329688, -156.901563),
		new Point2D.Double(236.492188, -154.878125),
		new Point2D.Double(238.090625, -153.521875),
		new Point2D.Double(239.140625, -152.825000),
		new Point2D.Double(240.564063, -151.990625),
		new Point2D.Double(242.429688, -151.110938),
		new Point2D.Double(244.001563, -150.618750),
		new Point2D.Double(245.431250, -150.148438),
		new Point2D.Double(246.487500, -149.792188),
		new Point2D.Double(247.850000, -149.103125),
		new Point2D.Double(248.640625, -148.420312),
		new Point2D.Double(249.425000, -147.401563),
		new Point2D.Double(250.209375, -146.498437),
		new Point2D.Double(250.764062, -145.825000),
		new Point2D.Double(251.773438, -145.035937),
		new Point2D.Double(252.556250, -144.587500),
		new Point2D.Double(253.320312, -144.045312),
		new Point2D.Double(254.081250, -143.609375),
		new Point2D.Double(254.717187, -143.182813),
		new Point2D.Double(255.020312, -143.079688),
		new Point2D.Double(255.117188, -142.975000),
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
