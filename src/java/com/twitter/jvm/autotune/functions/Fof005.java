import java.awt.geom.*;

public class Fof005 {
	public static Point2D.Double[] points = {
		new Point2D.Double(-62.312500, 0.149609),
		new Point2D.Double(-62.089062, 0.383203),
		new Point2D.Double(-61.642969, 1.138281),
		new Point2D.Double(-61.275391, 1.820703),
		new Point2D.Double(-60.649609, 3.058984),
		new Point2D.Double(-60.355469, 3.765625),
		new Point2D.Double(-59.769922, 4.929297),
		new Point2D.Double(-58.549609, 7.214453),
		new Point2D.Double(-57.702734, 8.661328),
		new Point2D.Double(-56.605078, 10.807422),
		new Point2D.Double(-56.233203, 11.614062),
		new Point2D.Double(-55.469141, 13.085156),
		new Point2D.Double(-55.195312, 13.687891),
		new Point2D.Double(-54.659375, 14.761328),
		new Point2D.Double(-54.460547, 15.238281),
		new Point2D.Double(-54.348047, 15.610938),
		new Point2D.Double(-54.314062, 15.773438),
		new Point2D.Double(-54.231250, 16.678125),
		new Point2D.Double(-54.141406, 17.405078),
		new Point2D.Double(-53.949609, 18.752344),
		new Point2D.Double(-53.634766, 20.572266),
		new Point2D.Double(-52.944922, 23.772266),
		new Point2D.Double(-52.607031, 24.854688),
		new Point2D.Double(-52.039453, 26.753516),
		new Point2D.Double(-51.585156, 28.055078),
		new Point2D.Double(-51.108594, 29.725781),
		new Point2D.Double(-50.646484, 31.173437),
		new Point2D.Double(-50.460938, 31.898047),
		new Point2D.Double(-50.371094, 32.258203),
		new Point2D.Double(-50.224219, 32.775000),
		new Point2D.Double(-50.179688, 34.352734),
		new Point2D.Double(-50.099609, 34.892969),
		new Point2D.Double(-50.015625, 35.483594),
		new Point2D.Double(-49.939844, 35.903906),
		new Point2D.Double(-49.903125, 36.088672),
		new Point2D.Double(-49.839453, 36.313281),
		new Point2D.Double(-49.805859, 36.543359),
		new Point2D.Double(-49.775000, 36.731250),
		new Point2D.Double(-49.747266, 36.881641),
		new Point2D.Double(-49.718750, 36.996484),
		new Point2D.Double(-49.691016, 37.193359),
		new Point2D.Double(-49.662500, 37.328906),
		new Point2D.Double(-49.636719, 37.407031),
		new Point2D.Double(-49.610937, 37.509375),
		new Point2D.Double(-49.585156, 37.561719),
		new Point2D.Double(-49.531250, 37.644922),
		new Point2D.Double(-49.502734, 37.728516),
		new Point2D.Double(-49.451563, 37.780469),
		new Point2D.Double(-49.423047, 37.894922),
		new Point2D.Double(-49.368750, 37.978516),
		new Point2D.Double(-49.340234, 38.092969),
		new Point2D.Double(-49.283594, 38.207422),
		new Point2D.Double(-49.226953, 38.321875),
		new Point2D.Double(-49.167578, 38.472656),
		new Point2D.Double(-49.113672, 38.555859),
		new Point2D.Double(-49.085156, 38.670703),
		new Point2D.Double(-49.059375, 38.748438),
		new Point2D.Double(-49.035547, 38.772656),
		new Point2D.Double(-48.633594, -18.067187),
		new Point2D.Double(-48.385547, -18.935547),
		new Point2D.Double(-47.546875, -21.637109),
		new Point2D.Double(-47.154688, -22.937891),
		new Point2D.Double(-46.675391, -24.483203),
		new Point2D.Double(-46.412109, -25.444531),
		new Point2D.Double(-46.172266, -26.306250),
		new Point2D.Double(-46.085156, -26.965625),
		new Point2D.Double(-46.048828, -27.332422),
		new Point2D.Double(-46.016016, -27.534375),
		new Point2D.Double(-45.879688, -27.466016),
		new Point2D.Double(-45.292187, -26.770703),
		new Point2D.Double(-43.800781, -22.870313),
		new Point2D.Double(-43.099219, -20.483203),
		new Point2D.Double(-42.316406, -17.828125),
		new Point2D.Double(-40.426563, -12.238672),
		new Point2D.Double(-39.815234, -10.316797),
		new Point2D.Double(-39.153906, -8.693359),
		new Point2D.Double(-37.554297, -4.674219),
		new Point2D.Double(-36.730469, -2.885937),
		new Point2D.Double(-35.458594, -0.112109),
		new Point2D.Double(-35.073828, 0.700781),
		new Point2D.Double(-34.946484, 0.998437),
		new Point2D.Double(-34.673437, -6.380078),
		new Point2D.Double(-34.363281, -7.460547),
		new Point2D.Double(-33.881641, -9.230078),
		new Point2D.Double(-33.487109, -10.583984),
		new Point2D.Double(-33.041016, -11.923828),
		new Point2D.Double(-32.655469, -13.189063),
		new Point2D.Double(-32.341016, -13.916797),
		new Point2D.Double(-32.196875, -14.349219),
		new Point2D.Double(-31.870313, -15.123828),
		new Point2D.Double(-31.802734, -15.258984),
		new Point2D.Double(-31.717188, -15.435547),
		new Point2D.Double(-31.672266, -16.899609),
		new Point2D.Double(-31.335938, -17.764453),
		new Point2D.Double(-30.637109, -19.540234),
		new Point2D.Double(-29.014453, -22.476953),
		new Point2D.Double(-27.026563, -25.287109),
		new Point2D.Double(-25.999219, -26.567969),
		new Point2D.Double(-25.416016, -27.345703),
		new Point2D.Double(-24.497656, -28.495703),
		new Point2D.Double(-24.082031, -29.086719),
		new Point2D.Double(-23.685938, -29.658203),
		new Point2D.Double(-23.464844, -29.953516),
		new Point2D.Double(-23.405078, -30.104297),
		new Point2D.Double(-23.376562, -30.187109),
		new Point2D.Double(-23.111719, -29.939844),
		new Point2D.Double(-22.479688, -29.545313),
		new Point2D.Double(-21.927734, -29.247266),
		new Point2D.Double(-21.457031, -29.011328),
		new Point2D.Double(-20.903906, -28.715234),
		new Point2D.Double(-20.502734, -28.355469),
		new Point2D.Double(-20.282422, -27.987500),
		new Point2D.Double(-19.951563, -27.190625),
		new Point2D.Double(-19.804297, -26.815625),
		new Point2D.Double(-19.651172, -26.392578),
		new Point2D.Double(-19.447656, -26.188281),
		new Point2D.Double(-19.116016, -26.085547),
		new Point2D.Double(-18.784375, -26.085547),
		new Point2D.Double(-18.415625, -26.159375),
		new Point2D.Double(-18.007812, -26.528125),
		new Point2D.Double(-17.583594, -27.037500),
		new Point2D.Double(-17.102734, -27.560938),
		new Point2D.Double(-16.696875, -28.237109),
		new Point2D.Double(-16.290234, -28.915234),
		new Point2D.Double(-15.992969, -29.473828),
		new Point2D.Double(-15.894531, -29.702344),
		new Point2D.Double(-15.866016, -29.759375),
		new Point2D.Double(-15.240234, -29.616406),
		new Point2D.Double(-14.516797, -29.129687),
		new Point2D.Double(-12.882812, -28.041016),
		new Point2D.Double(-11.557813, -27.146484),
		new Point2D.Double(-8.953125, -25.510938),
		new Point2D.Double(-7.400000, -24.577344),
		new Point2D.Double(-5.029297, -22.735547),
		new Point2D.Double(-3.825781, -21.274609),
		new Point2D.Double(-2.557812, -19.155078),
		new Point2D.Double(-1.459375, -16.663672),
		new Point2D.Double(-0.414453, -14.048438),
		new Point2D.Double(0.576172, -11.232031),
		new Point2D.Double(1.600000, -8.846484),
		new Point2D.Double(2.538281, -6.703516),
		new Point2D.Double(3.653906, -4.466406),
		new Point2D.Double(4.659375, -2.093359),
		new Point2D.Double(4.913281, -1.635547),
		new Point2D.Double(5.311328, 0.438672),
		new Point2D.Double(5.829688, 2.389844),
		new Point2D.Double(6.766016, 6.208984),
		new Point2D.Double(7.260156, 7.934375),
		new Point2D.Double(7.841016, 9.871875),
		new Point2D.Double(8.193359, 10.846094),
		new Point2D.Double(8.556641, 11.619531),
		new Point2D.Double(8.792188, 12.096875),
		new Point2D.Double(8.964453, 12.373047),
		new Point2D.Double(9.088672, 12.560156),
		new Point2D.Double(9.167969, 12.668750),
		new Point2D.Double(9.219141, 12.668750),
		new Point2D.Double(9.301562, 12.668750),
		new Point2D.Double(9.398047, 12.402344),
		new Point2D.Double(9.594531, 11.466016),
		new Point2D.Double(10.030469, 8.860938),
		new Point2D.Double(10.298047, 7.789844),
		new Point2D.Double(10.992188, 5.428516),
		new Point2D.Double(12.398047, 1.719922),
		new Point2D.Double(12.983984, 0.474609),
		new Point2D.Double(14.205469, -1.891797),
		new Point2D.Double(15.022656, -3.476172),
		new Point2D.Double(16.283984, -6.004688),
		new Point2D.Double(16.587500, -6.658203),
		new Point2D.Double(16.802344, -7.258203),
		new Point2D.Double(16.870313, -7.536328),
		new Point2D.Double(17.073047, -7.632812),
		new Point2D.Double(18.371875, -8.575391),
		new Point2D.Double(19.500000, -9.765625),
		new Point2D.Double(21.866797, -12.419531),
		new Point2D.Double(23.554688, -14.546875),
		new Point2D.Double(24.673828, -15.841016),
		new Point2D.Double(25.415625, -16.817187),
		new Point2D.Double(26.001172, -17.662891),
		new Point2D.Double(26.032422, -17.756641),
		new Point2D.Double(26.078516, -17.779688),
		new Point2D.Double(26.502734, -18.246484),
		new Point2D.Double(27.130078, -18.924609),
		new Point2D.Double(28.360937, -20.316016),
		new Point2D.Double(28.827734, -20.742969),
		new Point2D.Double(29.238281, -21.113672),
		new Point2D.Double(29.522266, -21.258203),
		new Point2D.Double(29.709766, -21.320703),
		new Point2D.Double(29.939453, -21.320703),
		new Point2D.Double(30.357422, -20.059375),
		new Point2D.Double(30.478125, -18.420313),
		new Point2D.Double(30.539844, -17.042969),
		new Point2D.Double(30.601562, -16.174219),
		new Point2D.Double(30.700781, -15.132422),
		new Point2D.Double(31.005469, -14.099609),
		new Point2D.Double(31.391016, -13.869531),
		new Point2D.Double(31.711719, -13.869531),
		new Point2D.Double(32.108203, -14.160937),
		new Point2D.Double(33.134766, -16.011328),
		new Point2D.Double(33.741016, -17.649609),
		new Point2D.Double(34.987109, -20.568359),
		new Point2D.Double(35.565234, -21.958984),
		new Point2D.Double(35.937891, -22.654297),
		new Point2D.Double(36.230469, -23.199609),
		new Point2D.Double(36.329687, -23.429688),
		new Point2D.Double(36.386719, -23.543750),
		new Point2D.Double(36.533984, -22.489062),
		new Point2D.Double(36.932422, -21.466406),
		new Point2D.Double(37.392969, -20.308594),
		new Point2D.Double(37.681250, -19.442969),
		new Point2D.Double(38.146484, -17.835547),
		new Point2D.Double(38.408594, -16.736719),
		new Point2D.Double(38.762891, -14.391016),
		new Point2D.Double(38.977344, -13.187891),
		new Point2D.Double(39.202344, -11.833203),
		new Point2D.Double(39.638281, -9.978906),
		new Point2D.Double(39.830078, -9.232031),
		new Point2D.Double(40.095703, -8.522266),
		new Point2D.Double(40.248828, -8.099219),
		new Point2D.Double(40.339844, -7.842187),
		new Point2D.Double(40.496484, -7.197266),
		new Point2D.Double(40.661328, -7.000391),
		new Point2D.Double(41.024609, -6.598047),
		new Point2D.Double(41.237500, -6.347266),
		new Point2D.Double(41.449609, -6.097656),
		new Point2D.Double(41.708203, -5.837891),
		new Point2D.Double(41.858984, -5.746094),
		new Point2D.Double(42.144141, -5.746094),
		new Point2D.Double(42.393359, -5.940625),
		new Point2D.Double(42.727734, -6.442188),
		new Point2D.Double(43.442969, -7.492578),
		new Point2D.Double(43.930469, -8.366016),
		new Point2D.Double(44.683203, -9.638281),
		new Point2D.Double(46.137109, -12.293359),
		new Point2D.Double(46.749219, -13.483984),
		new Point2D.Double(47.425781, -14.725391),
		new Point2D.Double(48.075000, -15.903516),
		new Point2D.Double(48.383203, -16.517578),
		new Point2D.Double(48.493359, -16.885938),
		new Point2D.Double(48.558203, -17.171484),
		new Point2D.Double(48.599219, -16.324609),
		new Point2D.Double(48.918750, -15.701562),
		new Point2D.Double(49.658594, -14.423438),
		new Point2D.Double(50.266406, -13.511328),
		new Point2D.Double(51.123828, -12.097656),
		new Point2D.Double(51.724219, -10.945703),
		new Point2D.Double(52.555859, -9.114062),
		new Point2D.Double(53.177734, -7.812500),
		new Point2D.Double(53.755859, -6.480469),
		new Point2D.Double(54.266406, -5.179297),
		new Point2D.Double(54.508984, -4.382422),
		new Point2D.Double(54.745703, -3.991797),
		new Point2D.Double(55.218359, -3.400391),
		new Point2D.Double(55.774219, -2.719141),
		new Point2D.Double(56.244531, -2.124609),
		new Point2D.Double(56.465625, -1.791797),
		new Point2D.Double(56.600391, -1.521484),
		new Point2D.Double(56.724609, -1.240625),
		new Point2D.Double(56.814844, -1.089844),
		new Point2D.Double(56.873828, -0.940625),
		new Point2D.Double(56.933203, -0.789844),
		new Point2D.Double(57.014844, -0.650391),
		new Point2D.Double(57.069141, -0.566797),
		new Point2D.Double(57.120312, -0.514844),
		new Point2D.Double(57.171484, -0.489063),
		new Point2D.Double(57.195703, -0.464453),
		new Point2D.Double(57.219922, -0.464453),
		new Point2D.Double(57.243750, -0.464453),
		new Point2D.Double(57.267187, -0.464453),
		new Point2D.Double(57.290625, -0.464453),
		new Point2D.Double(57.314844, -0.464453),
		new Point2D.Double(57.339062, -0.464453),
		new Point2D.Double(57.417969, -0.520312),
		new Point2D.Double(57.485937, -0.798438),
		new Point2D.Double(57.564062, -1.274219),
		new Point2D.Double(57.612109, -2.551953),
		new Point2D.Double(57.665625, -4.915234),
		new Point2D.Double(57.724609, -5.685156),
		new Point2D.Double(57.842578, -8.000000),
		new Point2D.Double(57.960547, -9.539844),
		new Point2D.Double(58.075781, -11.756641),
		new Point2D.Double(58.182422, -12.934375),
		new Point2D.Double(58.396484, -14.703906),
		new Point2D.Double(58.551172, -15.798047),
		new Point2D.Double(58.752344, -17.305469),
		new Point2D.Double(58.902734, -18.312109),
		new Point2D.Double(59.060547, -19.410156),
		new Point2D.Double(59.201563, -20.155469),
		new Point2D.Double(59.339453, -21.312109),
		new Point2D.Double(59.421094, -21.846484),
		new Point2D.Double(59.423437, -22.739453),
		new Point2D.Double(59.496875, -23.113672),
		new Point2D.Double(59.718750, -23.712891),
		new Point2D.Double(59.970312, -24.216016),
		new Point2D.Double(60.221094, -24.681250),
		new Point2D.Double(60.393359, -24.921094),
		new Point2D.Double(60.628906, -25.256250),
		new Point2D.Double(60.711719, -25.339063),
		new Point2D.Double(60.768750, -25.458594),
		new Point2D.Double(60.820312, -25.510156),
		new Point2D.Double(60.846094, -25.534375),
		new Point2D.Double(60.892578, -25.557422),
		new Point2D.Double(60.978125, -25.671484),
		new Point2D.Double(61.086719, -25.780078),
		new Point2D.Double(61.138281, -25.831641),
		new Point2D.Double(61.189844, -25.883203),
		new Point2D.Double(61.213672, -25.906641),
		new Point2D.Double(61.236719, -25.929688),
		new Point2D.Double(61.288281, -25.981250),
		new Point2D.Double(61.339844, -26.032812),
		new Point2D.Double(61.365625, -26.058203),
		new Point2D.Double(61.391406, -26.083984),
		new Point2D.Double(61.414844, -26.083984),
		new Point2D.Double(61.437891, -26.132812),
		new Point2D.Double(61.489453, -26.184375),
		new Point2D.Double(61.632031, -26.326953),
		new Point2D.Double(61.745703, -26.412109),
		new Point2D.Double(61.799609, -26.494141),
		new Point2D.Double(61.907812, -26.602344),
		new Point2D.Double(61.962109, -26.685156),
		new Point2D.Double(62.013281, -26.736328),
		new Point2D.Double(62.064844, -26.762109),
		new Point2D.Double(62.088281, -26.786328),
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