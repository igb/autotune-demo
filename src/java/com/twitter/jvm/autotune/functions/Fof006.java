package com.twitter.jvm.autotune.functions;

import java.awt.geom.*;

public class Fof006 {
	public static Point2D.Double[] points = {
		new Point2D.Double(-123.429688, 0.108594),
		new Point2D.Double(-123.321094, 0.546094),
		new Point2D.Double(-122.970313, 1.303906),
		new Point2D.Double(-122.659375, 1.864062),
		new Point2D.Double(-122.258594, 2.525781),
		new Point2D.Double(-121.861719, 3.260937),
		new Point2D.Double(-121.467969, 3.991406),
		new Point2D.Double(-121.207031, 4.452344),
		new Point2D.Double(-120.825781, 5.095313),
		new Point2D.Double(-120.635937, 5.547656),
		new Point2D.Double(-120.388281, 5.921094),
		new Point2D.Double(-120.128906, 6.378906),
		new Point2D.Double(-119.570312, 7.147656),
		new Point2D.Double(-118.734375, 8.222656),
		new Point2D.Double(-118.119531, 8.993750),
		new Point2D.Double(-117.249219, 10.130469),
		new Point2D.Double(-116.575781, 11.134375),
		new Point2D.Double(-115.065625, 13.014844),
		new Point2D.Double(-114.305469, 14.030469),
		new Point2D.Double(-112.690625, 15.732812),
		new Point2D.Double(-110.833594, 17.401563),
		new Point2D.Double(-109.375000, 18.667969),
		new Point2D.Double(-107.762500, 19.878906),
		new Point2D.Double(-105.635937, 21.175781),
		new Point2D.Double(-104.214062, 21.798437),
		new Point2D.Double(-102.778125, 22.121875),
		new Point2D.Double(-102.302344, 22.121875),
		new Point2D.Double(-102.116406, 22.121875),
		new Point2D.Double(-101.480469, 22.332031),
		new Point2D.Double(-99.713281, 23.002344),
		new Point2D.Double(-97.428906, 23.824219),
		new Point2D.Double(-94.705469, 24.307031),
		new Point2D.Double(-92.164844, 24.499219),
		new Point2D.Double(-89.440625, 24.499219),
		new Point2D.Double(-87.594531, 24.499219),
		new Point2D.Double(-85.732031, 24.108594),
		new Point2D.Double(-83.188281, 23.069531),
		new Point2D.Double(-81.483594, 22.405469),
		new Point2D.Double(-78.901562, 21.258594),
		new Point2D.Double(-77.334375, 20.523438),
		new Point2D.Double(-75.625781, 19.660937),
		new Point2D.Double(-74.201562, 18.813281),
		new Point2D.Double(-73.532031, 18.360156),
		new Point2D.Double(-72.917969, 17.746094),
		new Point2D.Double(-72.752344, 17.528906),
		new Point2D.Double(-72.571094, 17.478125),
		new Point2D.Double(-71.650781, 17.405469),
		new Point2D.Double(-70.103125, 17.091406),
		new Point2D.Double(-68.704688, 16.785937),
		new Point2D.Double(-67.098438, 16.368750),
		new Point2D.Double(-65.362500, 16.038281),
		new Point2D.Double(-64.185937, 15.871094),
		new Point2D.Double(-62.293750, 15.448438),
		new Point2D.Double(-60.704687, 15.166406),
		new Point2D.Double(-57.958594, 14.675000),
		new Point2D.Double(-54.909375, 13.964063),
		new Point2D.Double(-52.550000, 13.428906),
		new Point2D.Double(-50.221094, 12.794531),
		new Point2D.Double(-47.323437, 12.094531),
		new Point2D.Double(-46.089844, 11.732812),
		new Point2D.Double(-44.323437, 11.310937),
		new Point2D.Double(-43.682031, 11.095313),
		new Point2D.Double(-43.391406, 10.981250),
		new Point2D.Double(-43.345312, 10.981250),
		new Point2D.Double(-41.935156, 10.981250),
		new Point2D.Double(-40.153906, 11.151563),
		new Point2D.Double(-37.175000, 11.547656),
		new Point2D.Double(-35.142187, 11.955469),
		new Point2D.Double(-32.600781, 12.333594),
		new Point2D.Double(-30.865625, 12.628125),
		new Point2D.Double(-28.717969, 13.080469),
		new Point2D.Double(-26.814844, 13.567187),
		new Point2D.Double(-24.899219, 14.097656),
		new Point2D.Double(-23.158594, 14.685937),
		new Point2D.Double(-21.274219, 15.457031),
		new Point2D.Double(-20.254687, 16.041406),
		new Point2D.Double(-18.813281, 17.050000),
		new Point2D.Double(-18.389063, 17.475000),
		new Point2D.Double(-17.000781, 18.950000),
		new Point2D.Double(-15.457031, 20.677344),
		new Point2D.Double(-14.659375, 21.646875),
		new Point2D.Double(-13.301562, 23.007031),
		new Point2D.Double(-12.560156, 23.829687),
		new Point2D.Double(-11.890625, 24.637500),
		new Point2D.Double(-10.501563, 26.441406),
		new Point2D.Double(-10.129687, 27.187500),
		new Point2D.Double(-9.450000, 28.403125),
		new Point2D.Double(-9.246875, 28.948438),
		new Point2D.Double(-9.123437, 29.697656),
		new Point2D.Double(-8.942969, 30.314062),
		new Point2D.Double(-8.131250, 31.202344),
		new Point2D.Double(-7.346094, 31.915625),
		new Point2D.Double(-6.052344, 33.211719),
		new Point2D.Double(-5.332031, 33.934375),
		new Point2D.Double(-4.837500, 34.356250),
		new Point2D.Double(-4.226562, 34.969531),
		new Point2D.Double(-3.817969, 35.379688),
		new Point2D.Double(-3.482031, 35.850000),
		new Point2D.Double(-3.011719, 36.521875),
		new Point2D.Double(-2.542969, 37.191406),
		new Point2D.Double(-2.117188, 37.692188),
		new Point2D.Double(-1.794531, 38.078906),
		new Point2D.Double(-1.197656, 38.615625),
		new Point2D.Double(-0.639844, 38.989844),
		new Point2D.Double(-0.180469, 39.121875),
		new Point2D.Double(0.194531, 39.248438),
		new Point2D.Double(0.921875, 39.248438),
		new Point2D.Double(1.737500, 39.248438),
		new Point2D.Double(2.555469, 39.248438),
		new Point2D.Double(3.182031, 39.039062),
		new Point2D.Double(3.937500, 38.557031),
		new Point2D.Double(4.497656, 38.307812),
		new Point2D.Double(4.725781, 38.193750),
		new Point2D.Double(5.027344, 38.193750),
		new Point2D.Double(5.657813, 38.711719),
		new Point2D.Double(6.879688, 40.279688),
		new Point2D.Double(8.606250, 42.459375),
		new Point2D.Double(11.791406, 46.510156),
		new Point2D.Double(15.721094, 52.163281),
		new Point2D.Double(17.968750, 54.536719),
		new Point2D.Double(20.106250, 56.141406),
		new Point2D.Double(21.477344, 57.045313),
		new Point2D.Double(21.937500, 57.307812),
		new Point2D.Double(22.154688, 57.417969),
		new Point2D.Double(22.257031, 57.470312),
		new Point2D.Double(22.303125, 57.470312),
		new Point2D.Double(22.946094, 57.212500),
		new Point2D.Double(23.775781, 56.230469),
		new Point2D.Double(24.383594, 55.188281),
		new Point2D.Double(24.842188, 54.343750),
		new Point2D.Double(25.471875, 53.158594),
		new Point2D.Double(26.039062, 52.310156),
		new Point2D.Double(26.464844, 51.810156),
		new Point2D.Double(27.164062, 51.110937),
		new Point2D.Double(28.456250, 50.317969),
		new Point2D.Double(29.910156, 49.682812),
		new Point2D.Double(30.777344, 49.445312),
		new Point2D.Double(31.514844, 49.298437),
		new Point2D.Double(32.428906, 49.225000),
		new Point2D.Double(33.020313, 49.639844),
		new Point2D.Double(33.525000, 50.652344),
		new Point2D.Double(33.892969, 51.389844),
		new Point2D.Double(34.499219, 52.605469),
		new Point2D.Double(35.257031, 54.192969),
		new Point2D.Double(35.849219, 55.295313),
		new Point2D.Double(36.717969, 57.114063),
		new Point2D.Double(37.174219, 57.882031),
		new Point2D.Double(38.162500, 59.950000),
		new Point2D.Double(38.757812, 61.053125),
		new Point2D.Double(39.610156, 62.756250),
		new Point2D.Double(40.475781, 64.578125),
		new Point2D.Double(41.448437, 66.418750),
		new Point2D.Double(41.965625, 67.714844),
		new Point2D.Double(42.649219, 70.463281),
		new Point2D.Double(43.066406, 72.660938),
		new Point2D.Double(43.342969, 75.553125),
		new Point2D.Double(43.529688, 76.895313),
		new Point2D.Double(43.787500, 77.620312),
		new Point2D.Double(44.036719, 78.184375),
		new Point2D.Double(44.207031, 78.527344),
		new Point2D.Double(44.361719, 78.632031),
		new Point2D.Double(44.412500, 78.683594),
		new Point2D.Double(44.460156, 78.732031),
		new Point2D.Double(44.559375, 78.784375),
		new Point2D.Double(44.610156, 78.836719),
		new Point2D.Double(44.764063, 78.940625),
		new Point2D.Double(44.917969, 78.992969),
		new Point2D.Double(45.020313, 79.045312),
		new Point2D.Double(45.071875, 79.096875),
		new Point2D.Double(45.120312, 79.096875),
		new Point2D.Double(45.167187, 79.096875),
		new Point2D.Double(45.214844, 79.096875),
		new Point2D.Double(45.266406, 79.096875),
		new Point2D.Double(45.379688, 78.620312),
		new Point2D.Double(45.447656, 77.982812),
		new Point2D.Double(45.586719, 77.082031),
		new Point2D.Double(45.660156, 76.344531),
		new Point2D.Double(45.807031, 75.349219),
		new Point2D.Double(46.016406, 74.435937),
		new Point2D.Double(46.174219, 73.472656),
		new Point2D.Double(46.427344, 71.678125),
		new Point2D.Double(46.612500, 70.089844),
		new Point2D.Double(47.002344, 67.343750),
		new Point2D.Double(47.537500, 64.984375),
		new Point2D.Double(48.266406, 61.620312),
		new Point2D.Double(48.556250, 59.756250),
		new Point2D.Double(48.996875, 57.830469),
		new Point2D.Double(49.160156, 56.762500),
		new Point2D.Double(49.233594, 55.837500),
		new Point2D.Double(51.321094, 18.243750),
		new Point2D.Double(53.197656, 12.378906),
		new Point2D.Double(54.721094, 6.796094),
		new Point2D.Double(55.414062, 3.902344),
		new Point2D.Double(55.808594, 1.399219),
		new Point2D.Double(55.892969, 0.328906),
		new Point2D.Double(56.117188, -23.765625),
		new Point2D.Double(56.990625, -27.478906),
		new Point2D.Double(57.464062, -30.558594),
		new Point2D.Double(58.351562, -35.814844),
		new Point2D.Double(59.050000, -40.248438),
		new Point2D.Double(59.602344, -42.782031),
		new Point2D.Double(60.422656, -45.976562),
		new Point2D.Double(61.129688, -47.934375),
		new Point2D.Double(61.875000, -49.596875),
		new Point2D.Double(62.232031, -50.238281),
		new Point2D.Double(62.615625, -50.883594),
		new Point2D.Double(62.957813, -51.225781),
		new Point2D.Double(63.071094, -51.452344),
		new Point2D.Double(63.276562, -51.657812),
		new Point2D.Double(63.328125, -51.709375),
		new Point2D.Double(63.376562, -51.709375),
		new Point2D.Double(63.479687, -51.709375),
		new Point2D.Double(63.625781, -51.562500),
		new Point2D.Double(64.118750, -50.719531),
		new Point2D.Double(64.538281, -49.803125),
		new Point2D.Double(64.861719, -49.153125),
		new Point2D.Double(65.038281, -48.850000),
		new Point2D.Double(65.146875, -48.682812),
		new Point2D.Double(65.436719, -48.682812),
		new Point2D.Double(66.214062, -49.214844),
		new Point2D.Double(66.937500, -50.482031),
		new Point2D.Double(68.189063, -52.980469),
		new Point2D.Double(69.778906, -55.567188),
		new Point2D.Double(70.903125, -57.137500),
		new Point2D.Double(71.361719, -57.982031),
		new Point2D.Double(71.621094, -58.625781),
		new Point2D.Double(71.683594, -58.977344),
		new Point2D.Double(72.424219, -61.319531),
		new Point2D.Double(73.239844, -62.718750),
		new Point2D.Double(74.971875, -64.552344),
		new Point2D.Double(76.196094, -65.016406),
		new Point2D.Double(77.396094, -65.185156),
		new Point2D.Double(78.822656, -65.264062),
		new Point2D.Double(80.314063, -63.740625),
		new Point2D.Double(81.894531, -60.565625),
		new Point2D.Double(82.936719, -56.814844),
		new Point2D.Double(83.582813, -50.978906),
		new Point2D.Double(84.123437, -44.484375),
		new Point2D.Double(84.730469, -39.154688),
		new Point2D.Double(85.717969, -34.331250),
		new Point2D.Double(87.049219, -29.679688),
		new Point2D.Double(87.949219, -26.976562),
		new Point2D.Double(89.461719, -22.881250),
		new Point2D.Double(90.002344, -21.556250),
		new Point2D.Double(90.274219, -21.009375),
		new Point2D.Double(90.387500, -20.771094),
		new Point2D.Double(90.477344, -18.334375),
		new Point2D.Double(90.831250, -12.750781),
		new Point2D.Double(91.327344, -5.404687),
		new Point2D.Double(91.932812, -0.726562),
		new Point2D.Double(92.701562, 4.479687),
		new Point2D.Double(93.090625, 7.225000),
		new Point2D.Double(93.477344, 9.496875),
		new Point2D.Double(93.675781, 10.232031),
		new Point2D.Double(93.794531, 10.948438),
		new Point2D.Double(93.846094, 11.104688),
		new Point2D.Double(93.896875, 11.257812),
		new Point2D.Double(94.118750, 11.653125),
		new Point2D.Double(94.407813, 12.309375),
		new Point2D.Double(94.618750, 12.424219),
		new Point2D.Double(94.840625, 11.881250),
		new Point2D.Double(95.175781, 8.624219),
		new Point2D.Double(95.580469, 4.457031),
		new Point2D.Double(96.725781, 0.028125),
		new Point2D.Double(97.433594, -1.766406),
		new Point2D.Double(98.247656, -3.324219),
		new Point2D.Double(99.187500, -4.910938),
		new Point2D.Double(99.998437, -6.385937),
		new Point2D.Double(100.978906, -7.889062),
		new Point2D.Double(102.085938, -8.996094),
		new Point2D.Double(103.022656, -9.574219),
		new Point2D.Double(103.936719, -9.857812),
		new Point2D.Double(104.669531, -9.993750),
		new Point2D.Double(105.346094, -9.878906),
		new Point2D.Double(105.819531, -8.653906),
		new Point2D.Double(106.056250, -6.918750),
		new Point2D.Double(106.146094, -3.425000),
		new Point2D.Double(106.488281, 0.090625),
		new Point2D.Double(107.945312, 2.960156),
		new Point2D.Double(110.013281, 5.127344),
		new Point2D.Double(111.389844, 6.186719),
		new Point2D.Double(112.221094, 6.485938),
		new Point2D.Double(113.082813, 6.549219),
		new Point2D.Double(113.652344, 6.549219),
		new Point2D.Double(114.046094, 6.664844),
		new Point2D.Double(114.627344, 7.141406),
		new Point2D.Double(115.696094, 8.903906),
		new Point2D.Double(116.396094, 11.544531),
		new Point2D.Double(117.082813, 14.548438),
		new Point2D.Double(117.573437, 16.528125),
		new Point2D.Double(117.912500, 17.346875),
		new Point2D.Double(118.230469, 17.996875),
		new Point2D.Double(118.764844, 18.596094),
		new Point2D.Double(119.264844, 19.035937),
		new Point2D.Double(119.658594, 19.375781),
		new Point2D.Double(119.761719, 19.480469),
		new Point2D.Double(119.864844, 19.532812),
		new Point2D.Double(119.913281, 19.631250),
		new Point2D.Double(120.253906, 19.206250),
		new Point2D.Double(120.992188, 18.405469),
		new Point2D.Double(121.251563, 17.948438),
		new Point2D.Double(121.818750, 17.256250),
		new Point2D.Double(122.171094, 16.841406),
		new Point2D.Double(122.513281, 16.499219),
		new Point2D.Double(122.792969, 16.105469),
		new Point2D.Double(122.978125, 15.539844),
		new Point2D.Double(123.107031, 14.813281),
		new Point2D.Double(123.179688, 2.032031),
		new Point2D.Double(123.388281, 1.119531),
		new Point2D.Double(123.675781, -0.255469),
		new Point2D.Double(123.821875, -1.262500),
		new Point2D.Double(123.895313, -2.694531),
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
