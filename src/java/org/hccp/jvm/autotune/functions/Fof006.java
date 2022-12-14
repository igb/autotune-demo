package org.hccp.jvm.autotune.functions;

import org.hccp.jvm.autotune.Function;

import java.awt.geom.*;

public class Fof006  implements Function {
	public static Point2D.Double[] points = {
				new Point2D.Double(-137.050000, 3.632812),
		new Point2D.Double(-136.238281, 3.632812),
		new Point2D.Double(-135.049219, 3.632812),
		new Point2D.Double(-133.968750, 3.632812),
		new Point2D.Double(-133.333594, 3.705469),
		new Point2D.Double(-132.803125, 3.774219),
		new Point2D.Double(-131.889062, 4.053906),
		new Point2D.Double(-131.350000, 4.189844),
		new Point2D.Double(-130.533594, 4.463281),
		new Point2D.Double(-129.992969, 4.667187),
		new Point2D.Double(-129.457031, 4.935937),
		new Point2D.Double(-128.818750, 5.219531),
		new Point2D.Double(-128.546875, 5.288281),
		new Point2D.Double(-128.001563, 5.561719),
		new Point2D.Double(-127.629688, 5.748437),
		new Point2D.Double(-127.258594, 5.934375),
		new Point2D.Double(-126.957813, 6.111719),
		new Point2D.Double(-126.398438, 6.425000),
		new Point2D.Double(-125.938281, 6.619531),
		new Point2D.Double(-125.563281, 6.808594),
		new Point2D.Double(-125.106250, 7.002344),
		new Point2D.Double(-124.646094, 7.134375),
		new Point2D.Double(-124.015625, 7.275000),
		new Point2D.Double(-123.747656, 7.342187),
		new Point2D.Double(-123.116406, 7.410938),
		new Point2D.Double(-122.490625, 7.410938),
		new Point2D.Double(-121.949219, 7.410938),
		new Point2D.Double(-121.676563, 7.410938),
		new Point2D.Double(-120.939063, 7.410938),
		new Point2D.Double(-119.878125, 7.410938),
		new Point2D.Double(-118.601562, 7.410938),
		new Point2D.Double(-117.012500, 7.321094),
		new Point2D.Double(-115.423438, 7.321094),
		new Point2D.Double(-113.834375, 7.321094),
		new Point2D.Double(-112.385937, 7.321094),
		new Point2D.Double(-111.422656, 7.321094),
		new Point2D.Double(-110.352344, 7.321094),
		new Point2D.Double(-109.983594, 7.321094),
		new Point2D.Double(-109.432812, 7.321094),
		new Point2D.Double(-109.267969, 7.487500),
		new Point2D.Double(-109.221875, 7.487500),
		new Point2D.Double(-108.766406, 7.487500),
		new Point2D.Double(-108.306250, 7.487500),
		new Point2D.Double(-107.662500, 7.556250),
		new Point2D.Double(-107.021094, 7.699219),
		new Point2D.Double(-106.289062, 8.035937),
		new Point2D.Double(-106.106250, 8.158594),
		new Point2D.Double(-105.624219, 8.505469),
		new Point2D.Double(-105.142969, 8.852344),
		new Point2D.Double(-104.938281, 9.057813),
		new Point2D.Double(-104.464844, 9.398438),
		new Point2D.Double(-103.964844, 9.825781),
		new Point2D.Double(-103.504688, 10.088281),
		new Point2D.Double(-103.032813, 10.425000),
		new Point2D.Double(-102.487500, 10.698438),
		new Point2D.Double(-102.027344, 10.960938),
		new Point2D.Double(-101.575000, 11.219531),
		new Point2D.Double(-101.014062, 11.470313),
		new Point2D.Double(-100.713281, 11.590625),
		new Point2D.Double(-100.414844, 11.765625),
		new Point2D.Double(-100.002344, 11.878906),
		new Point2D.Double(-99.628125, 12.004687),
		new Point2D.Double(-99.355469, 12.004687),
		new Point2D.Double(-98.901562, 12.065625),
		new Point2D.Double(-98.356250, 12.134375),
		new Point2D.Double(-98.083594, 12.134375),
		new Point2D.Double(-97.810937, 12.134375),
		new Point2D.Double(-96.907813, 12.134375),
		new Point2D.Double(-95.993750, 12.134375),
		new Point2D.Double(-95.624219, 12.134375),
		new Point2D.Double(-95.351562, 12.134375),
		new Point2D.Double(-95.165625, 12.134375),
		new Point2D.Double(-94.709375, 12.067187),
		new Point2D.Double(-94.071094, 12.067187),
		new Point2D.Double(-93.126563, 11.988281),
		new Point2D.Double(-92.285938, 11.988281),
		new Point2D.Double(-91.821094, 11.988281),
		new Point2D.Double(-90.869531, 11.909375),
		new Point2D.Double(-90.029687, 11.835938),
		new Point2D.Double(-88.334375, 11.591406),
		new Point2D.Double(-87.467187, 11.439063),
		new Point2D.Double(-86.515625, 11.281250),
		new Point2D.Double(-85.460156, 11.198438),
		new Point2D.Double(-84.615625, 11.198438),
		new Point2D.Double(-83.772656, 11.198438),
		new Point2D.Double(-83.408594, 11.198438),
		new Point2D.Double(-82.774219, 11.198438),
		new Point2D.Double(-82.132812, 11.335156),
		new Point2D.Double(-81.539062, 11.420312),
		new Point2D.Double(-80.897656, 11.705469),
		new Point2D.Double(-79.697656, 12.046094),
		new Point2D.Double(-78.746094, 12.364844),
		new Point2D.Double(-77.676563, 12.858594),
		new Point2D.Double(-76.182812, 13.778125),
		new Point2D.Double(-75.435156, 14.153125),
		new Point2D.Double(-74.503125, 14.541406),
		new Point2D.Double(-73.767969, 14.910156),
		new Point2D.Double(-73.135937, 15.119531),
		new Point2D.Double(-72.676563, 15.318750),
		new Point2D.Double(-72.216406, 15.581250),
		new Point2D.Double(-71.632031, 16.025000),
		new Point2D.Double(-71.286719, 16.507812),
		new Point2D.Double(-70.862500, 17.007031),
		new Point2D.Double(-70.420312, 17.599219),
		new Point2D.Double(-70.199219, 17.895312),
		new Point2D.Double(-69.757031, 18.487500),
		new Point2D.Double(-69.247656, 19.491406),
		new Point2D.Double(-69.155469, 19.491406),
		new Point2D.Double(-68.855469, 19.491406),
		new Point2D.Double(-68.310156, 19.628906),
		new Point2D.Double(-67.123437, 19.909375),
		new Point2D.Double(-66.755469, 19.909375),
		new Point2D.Double(-65.753906, 20.050781),
		new Point2D.Double(-65.481250, 20.119531),
		new Point2D.Double(-64.992188, 20.182813),
		new Point2D.Double(-64.878125, 20.182813),
		new Point2D.Double(-64.724219, 20.182813),
		new Point2D.Double(-64.558594, 20.182813),
		new Point2D.Double(-64.332031, 20.182813),
		new Point2D.Double(-64.030469, 20.182813),
		new Point2D.Double(-63.304688, 20.182813),
		new Point2D.Double(-62.844531, 20.182813),
		new Point2D.Double(-62.657031, 20.182813),
		new Point2D.Double(-62.282031, 20.246094),
		new Point2D.Double(-61.910156, 20.246094),
		new Point2D.Double(-61.535156, 20.309375),
		new Point2D.Double(-61.075000, 20.372656),
		new Point2D.Double(-60.619531, 20.435938),
		new Point2D.Double(-60.079687, 20.503125),
		new Point2D.Double(-59.536719, 20.639844),
		new Point2D.Double(-58.902344, 20.708594),
		new Point2D.Double(-58.266406, 20.850000),
		new Point2D.Double(-57.428125, 21.082031),
		new Point2D.Double(-56.571875, 21.468750),
		new Point2D.Double(-55.586719, 22.047656),
		new Point2D.Double(-54.894531, 22.587500),
		new Point2D.Double(-53.643750, 23.750781),
		new Point2D.Double(-52.850000, 24.386719),
		new Point2D.Double(-52.259375, 24.978906),
		new Point2D.Double(-51.381250, 25.625781),
		new Point2D.Double(-50.601562, 26.186719),
		new Point2D.Double(-49.908594, 26.718750),
		new Point2D.Double(-48.822656, 27.711719),
		new Point2D.Double(-48.058594, 28.646875),
		new Point2D.Double(-47.459375, 29.757812),
		new Point2D.Double(-47.413281, 29.757812),
		new Point2D.Double(-46.867969, 29.757812),
		new Point2D.Double(-46.209375, 29.899219),
		new Point2D.Double(-45.246094, 30.143750),
		new Point2D.Double(-43.450000, 30.690625),
		new Point2D.Double(-42.036719, 31.164062),
		new Point2D.Double(-41.560938, 31.323438),
		new Point2D.Double(-40.347656, 31.778906),
		new Point2D.Double(-39.978906, 31.927344),
		new Point2D.Double(-38.892969, 32.219531),
		new Point2D.Double(-38.524219, 32.367969),
		new Point2D.Double(-38.155469, 32.442188),
		new Point2D.Double(-36.843750, 32.674219),
		new Point2D.Double(-36.484375, 32.746875),
		new Point2D.Double(-35.753906, 32.821094),
		new Point2D.Double(-35.385156, 32.821094),
		new Point2D.Double(-34.652344, 32.821094),
		new Point2D.Double(-33.444531, 32.821094),
		new Point2D.Double(-32.850000, 32.821094),
		new Point2D.Double(-31.779688, 32.821094),
		new Point2D.Double(-31.031250, 32.821094),
		new Point2D.Double(-29.960938, 32.736719),
		new Point2D.Double(-29.009375, 32.578906),
		new Point2D.Double(-27.939062, 32.578906),
		new Point2D.Double(-26.739062, 32.578906),
		new Point2D.Double(-25.668750, 32.578906),
		new Point2D.Double(-24.479688, 32.578906),
		new Point2D.Double(-23.643750, 32.578906),
		new Point2D.Double(-22.704687, 32.892969),
		new Point2D.Double(-22.228906, 33.052344),
		new Point2D.Double(-21.333594, 33.443750),
		new Point2D.Double(-20.489062, 33.903906),
		new Point2D.Double(-19.538281, 34.754688),
		new Point2D.Double(-19.424219, 34.869531),
		new Point2D.Double(-19.378125, 34.869531),
		new Point2D.Double(-18.839844, 34.869531),
		new Point2D.Double(-18.567187, 35.006250),
		new Point2D.Double(-17.135938, 35.492188),
		new Point2D.Double(-15.353125, 36.259375),
		new Point2D.Double(-14.282813, 36.753125),
		new Point2D.Double(-13.331250, 37.229687),
		new Point2D.Double(-12.869531, 37.460938),
		new Point2D.Double(-11.776563, 38.045313),
		new Point2D.Double(-10.826562, 38.521094),
		new Point2D.Double(-10.096875, 38.886719),
		new Point2D.Double(-9.255469, 39.344531),
		new Point2D.Double(-8.496094, 39.878906),
		new Point2D.Double(-7.910938, 40.318750),
		new Point2D.Double(-7.620312, 40.537500),
		new Point2D.Double(-7.120312, 40.964844),
		new Point2D.Double(-6.903125, 41.255469),
		new Point2D.Double(-6.497656, 41.662500),
		new Point2D.Double(-6.092187, 42.069531),
		new Point2D.Double(-5.592187, 42.496875),
		new Point2D.Double(-4.878125, 43.042969),
		new Point2D.Double(-3.966406, 43.604687),
		new Point2D.Double(-3.671094, 43.826563),
		new Point2D.Double(-2.935938, 44.195312),
		new Point2D.Double(-2.295313, 44.480469),
		new Point2D.Double(-1.757031, 44.682812),
		new Point2D.Double(-1.217188, 44.818750),
		new Point2D.Double(-0.678125, 44.954687),
		new Point2D.Double(-0.231250, 45.020313),
		new Point2D.Double(0.305469, 45.086719),
		new Point2D.Double(0.764062, 45.155469),
		new Point2D.Double(1.387500, 45.155469),
		new Point2D.Double(1.931250, 45.292187),
		new Point2D.Double(2.557812, 45.364063),
		new Point2D.Double(3.103125, 45.432812),
		new Point2D.Double(4.064063, 45.591406),
		new Point2D.Double(4.908594, 45.745312),
		new Point2D.Double(6.097656, 46.000781),
		new Point2D.Double(7.058594, 46.244531),
		new Point2D.Double(8.128906, 46.489063),
		new Point2D.Double(9.199219, 46.653906),
		new Point2D.Double(9.567969, 46.728125),
		new Point2D.Double(10.209375, 46.728125),
		new Point2D.Double(10.765625, 46.728125),
		new Point2D.Double(11.181250, 46.728125),
		new Point2D.Double(11.352344, 46.900781),
		new Point2D.Double(11.492188, 46.900781),
		new Point2D.Double(11.975000, 47.322656),
		new Point2D.Double(12.485938, 47.908594),
		new Point2D.Double(13.470313, 49.075781),
		new Point2D.Double(15.152344, 51.565625),
		new Point2D.Double(15.853906, 52.971875),
		new Point2D.Double(16.142187, 53.837500),
		new Point2D.Double(16.591406, 55.279688),
		new Point2D.Double(17.303125, 57.271875),
		new Point2D.Double(17.688281, 58.117969),
		new Point2D.Double(18.050000, 58.842969),
		new Point2D.Double(18.684375, 60.378906),
		new Point2D.Double(19.034375, 61.699219),
		new Point2D.Double(19.416406, 63.421094),
		new Point2D.Double(19.710156, 65.303906),
		new Point2D.Double(19.978125, 67.539844),
		new Point2D.Double(20.158594, 68.264844),
		new Point2D.Double(20.555469, 69.799219),
		new Point2D.Double(21.139844, 70.747656),
		new Point2D.Double(21.639844, 71.175000),
		new Point2D.Double(21.912500, 71.311719),
		new Point2D.Double(22.280469, 71.459375),
		new Point2D.Double(22.443750, 74.197656),
		new Point2D.Double(22.878125, 75.496875),
		new Point2D.Double(23.271094, 76.440625),
		new Point2D.Double(23.884375, 77.664844),
		new Point2D.Double(24.574219, 78.974219),
		new Point2D.Double(24.845312, 79.519531),
		new Point2D.Double(24.970312, 79.896094),
		new Point2D.Double(25.088281, 80.196875),
		new Point2D.Double(25.269531, 80.686719),
		new Point2D.Double(25.392969, 81.175000),
		new Point2D.Double(25.455469, 81.363281),
		new Point2D.Double(25.512500, 81.591406),
		new Point2D.Double(25.568750, 81.757812),
		new Point2D.Double(25.619531, 81.862500),
		new Point2D.Double(25.667969, 81.911719),
		new Point2D.Double(25.725000, 82.078906),
		new Point2D.Double(25.782031, 82.193750),
		new Point2D.Double(25.957031, 82.607812),
		new Point2D.Double(26.019531, 82.796094),
		new Point2D.Double(26.082031, 82.984375),
		new Point2D.Double(26.258594, 83.287500),
		new Point2D.Double(26.525781, 83.832813),
		new Point2D.Double(26.773438, 84.216406),
		new Point2D.Double(27.114062, 84.695312),
		new Point2D.Double(27.475781, 85.182812),
		new Point2D.Double(27.589844, 85.297656),
		new Point2D.Double(28.002344, 85.531250),
		new Point2D.Double(28.377344, 85.657813),
		new Point2D.Double(28.835156, 85.789062),
		new Point2D.Double(29.099219, 85.855469),
		new Point2D.Double(29.746094, 85.924219),
		new Point2D.Double(29.932813, 85.924219),
		new Point2D.Double(30.210156, 85.924219),
		new Point2D.Double(30.313281, 85.924219),
		new Point2D.Double(30.592188, 69.126563),
		new Point2D.Double(30.699219, 67.946875),
		new Point2D.Double(31.422656, 59.254688),
		new Point2D.Double(32.109375, 54.695312),
		new Point2D.Double(32.700781, 51.734375),
		new Point2D.Double(33.444531, 48.260937),
		new Point2D.Double(34.223438, 45.585156),
		new Point2D.Double(34.585156, 44.092969),
		new Point2D.Double(35.103906, 42.300000),
		new Point2D.Double(35.251562, 41.931250),
		new Point2D.Double(35.319531, 41.544531),
		new Point2D.Double(36.507031, 26.581250),
		new Point2D.Double(36.923437, 25.665625),
		new Point2D.Double(38.467188, 22.675781),
		new Point2D.Double(39.182031, 21.418750),
		new Point2D.Double(39.795313, 20.107813),
		new Point2D.Double(40.354687, 19.232031),
		new Point2D.Double(40.892969, 18.539844),
		new Point2D.Double(41.228125, 18.130469),
		new Point2D.Double(41.456250, 17.959375),
		new Point2D.Double(41.502344, 17.867188),
		new Point2D.Double(41.616406, 17.753125),
		new Point2D.Double(41.945312, 17.361719),
		new Point2D.Double(42.304688, 16.691406),
		new Point2D.Double(42.546094, 16.210156),
		new Point2D.Double(42.608594, 16.022656),
		new Point2D.Double(42.858594, 15.460156),
		new Point2D.Double(43.042969, 15.089063),
		new Point2D.Double(43.224219, 14.788281),
		new Point2D.Double(43.403906, 14.489844),
		new Point2D.Double(43.574219, 14.262500),
		new Point2D.Double(43.813281, 13.960938),
		new Point2D.Double(44.047656, 13.666406),
		new Point2D.Double(44.252344, 13.461719),
		new Point2D.Double(44.377344, 13.274219),
		new Point2D.Double(44.910156, 12.678906),
		new Point2D.Double(45.108594, 12.480469),
		new Point2D.Double(45.550000, 11.976562),
		new Point2D.Double(45.675000, 11.789062),
		new Point2D.Double(46.014063, 11.450000),
		new Point2D.Double(46.218750, 11.245313),
		new Point2D.Double(46.634375, 10.949219),
		new Point2D.Double(46.935938, 10.710156),
		new Point2D.Double(47.424219, 10.346875),
		new Point2D.Double(47.538281, 10.232812),
		new Point2D.Double(47.880469, 9.947656),
		new Point2D.Double(47.932031, 9.896094),
		new Point2D.Double(48.153906, 9.617188),
		new Point2D.Double(48.267969, 9.560156),
		new Point2D.Double(48.490625, 9.280469),
		new Point2D.Double(48.604687, 9.166406),
		new Point2D.Double(48.957813, 8.750781),
		new Point2D.Double(49.162500, 8.546094),
		new Point2D.Double(49.696875, 7.949219),
		new Point2D.Double(50.106250, 7.539844),
		new Point2D.Double(50.668750, 7.164844),
		new Point2D.Double(50.856250, 7.039844),
		new Point2D.Double(51.270313, 6.807812),
		new Point2D.Double(51.457813, 6.745312),
		new Point2D.Double(51.873438, 6.631250),
		new Point2D.Double(51.987500, 6.631250),
		new Point2D.Double(52.401562, 6.631250),
		new Point2D.Double(52.567188, 6.631250),
		new Point2D.Double(52.743750, 6.819531),
		new Point2D.Double(52.874219, 7.281250),
		new Point2D.Double(53.078125, 7.828125),
		new Point2D.Double(53.219531, 8.471094),
		new Point2D.Double(53.354687, 9.203125),
		new Point2D.Double(53.422656, 10.290625),
		new Point2D.Double(53.490625, 10.563281),
		new Point2D.Double(53.626562, 11.383594),
		new Point2D.Double(53.694531, 11.657031),
		new Point2D.Double(53.892969, 12.392188),
		new Point2D.Double(53.955469, 12.580469),
		new Point2D.Double(54.221875, 13.315625),
		new Point2D.Double(54.409375, 13.692187),
		new Point2D.Double(54.533594, 14.066406),
		new Point2D.Double(54.658594, 14.442969),
		new Point2D.Double(54.835156, 14.860938),
		new Point2D.Double(54.892187, 14.975781),
		new Point2D.Double(55.067969, 15.392188),
		new Point2D.Double(55.187500, 15.695312),
		new Point2D.Double(55.369531, 16.186719),
		new Point2D.Double(55.614063, 16.678125),
		new Point2D.Double(55.864063, 17.054688),
		new Point2D.Double(56.193750, 17.448438),
		new Point2D.Double(56.506250, 17.762500),
		new Point2D.Double(56.733594, 17.991406),
		new Point2D.Double(56.961719, 18.049219),
		new Point2D.Double(57.239844, 18.049219),
		new Point2D.Double(57.291406, 18.049219),
		new Point2D.Double(57.570312, 17.992188),
		new Point2D.Double(57.684375, 17.935156),
		new Point2D.Double(58.048437, 17.446094),
		new Point2D.Double(58.253125, 17.241406),
		new Point2D.Double(58.707813, 16.661719),
		new Point2D.Double(58.946875, 16.360156),
		new Point2D.Double(59.185938, 16.058594),
		new Point2D.Double(59.300000, 16.001562),
		new Point2D.Double(59.756250, 15.659375),
		new Point2D.Double(59.943750, 15.596875),
		new Point2D.Double(60.285156, 15.369531),
		new Point2D.Double(60.399219, 15.312500),
		new Point2D.Double(60.814844, 15.135938),
		new Point2D.Double(60.866406, 15.084375),
		new Point2D.Double(61.088281, 14.862500),
		new Point2D.Double(61.275781, 14.862500),
		new Point2D.Double(62.013281, 14.936719),
		new Point2D.Double(62.964062, 15.095313),
		new Point2D.Double(65.463281, 15.528125),
		new Point2D.Double(66.389844, 15.757031),
		new Point2D.Double(67.138281, 15.973437),
		new Point2D.Double(67.774219, 16.256250),
		new Point2D.Double(68.337500, 16.611719),
		new Point2D.Double(69.125781, 17.245313),
		new Point2D.Double(69.692188, 17.665625),
		new Point2D.Double(70.697656, 18.673437),
		new Point2D.Double(71.215625, 19.192187),
		new Point2D.Double(72.021094, 20.478906),
		new Point2D.Double(72.257812, 20.953125),
		new Point2D.Double(72.759375, 21.910156),
		new Point2D.Double(72.963281, 22.456250),
		new Point2D.Double(73.132031, 22.683594),
		new Point2D.Double(73.303125, 22.856250),
		new Point2D.Double(73.524219, 23.078906),
		new Point2D.Double(73.575781, 23.078906),
		new Point2D.Double(73.745312, 23.250781),
		new Point2D.Double(73.858594, 23.307813),
		new Point2D.Double(74.160156, 23.485937),
		new Point2D.Double(74.531250, 23.610937),
		new Point2D.Double(75.175000, 23.804688),
		new Point2D.Double(75.907031, 23.935938),
		new Point2D.Double(76.277344, 24.060938),
		new Point2D.Double(76.877344, 24.175000),
		new Point2D.Double(77.103906, 24.175000),
		new Point2D.Double(77.206250, 24.227344),
		new Point2D.Double(77.371094, 24.336719),
		new Point2D.Double(77.535156, 24.446094),
		new Point2D.Double(77.705469, 24.675000),
		new Point2D.Double(77.932031, 24.903125),
		new Point2D.Double(78.232031, 25.142187),
		new Point2D.Double(78.573437, 25.485937),
		new Point2D.Double(78.687500, 25.543750),
		new Point2D.Double(79.027344, 25.600000),
		new Point2D.Double(79.328906, 25.600000),
		new Point2D.Double(79.699219, 25.600000),
		new Point2D.Double(80.175781, 25.260156),
		new Point2D.Double(80.756250, 24.825000),
		new Point2D.Double(81.272656, 24.308594),
		new Point2D.Double(81.976562, 23.678906),
		new Point2D.Double(82.476562, 23.253125),
		new Point2D.Double(82.971094, 22.832812),
		new Point2D.Double(83.671875, 22.206250),
		new Point2D.Double(84.262500, 21.764063),
		new Point2D.Double(84.853125, 21.247656),
		new Point2D.Double(85.646094, 20.454687),
		new Point2D.Double(86.036719, 20.126562),
		new Point2D.Double(86.275781, 19.950000),
		new Point2D.Double(86.378125, 19.847656),
		new Point2D.Double(86.661719, 19.847656),
		new Point2D.Double(87.399219, 19.921875),
		new Point2D.Double(88.243750, 20.075781),
		new Point2D.Double(89.448437, 20.228125),
		new Point2D.Double(90.985156, 20.550781),
		new Point2D.Double(91.703125, 20.695312),
		new Point2D.Double(91.974219, 20.763281),
		new Point2D.Double(92.880469, 21.114844),
		new Point2D.Double(93.340625, 21.246875),
		new Point2D.Double(93.800000, 21.378906),
		new Point2D.Double(94.251563, 21.445312),
		new Point2D.Double(95.158594, 21.513281),
		new Point2D.Double(95.421875, 21.513281),
		new Point2D.Double(97.010937, 21.513281),
		new Point2D.Double(98.217187, 21.288281),
		new Point2D.Double(98.489844, 21.220312),
		new Point2D.Double(99.311719, 20.958594),
		new Point2D.Double(99.771875, 20.828125),
		new Point2D.Double(100.231250, 20.698438),
		new Point2D.Double(100.414844, 20.637500),
		new Point2D.Double(100.687500, 20.569531),
		new Point2D.Double(101.332813, 20.377344),
		new Point2D.Double(101.632031, 20.377344),
		new Point2D.Double(102.042187, 20.316406),
		new Point2D.Double(102.320312, 20.316406),
		new Point2D.Double(102.434375, 20.316406),
		new Point2D.Double(102.650781, 20.316406),
		new Point2D.Double(102.764844, 20.316406),
		new Point2D.Double(102.978125, 20.316406),
		new Point2D.Double(103.143750, 20.316406),
		new Point2D.Double(103.246094, 20.368750),
		new Point2D.Double(103.348438, 20.420313),
		new Point2D.Double(103.450000, 20.523438),
		new Point2D.Double(103.688281, 20.700781),
		new Point2D.Double(103.914844, 20.928906),
		new Point2D.Double(104.214062, 21.167188),
		new Point2D.Double(104.720313, 21.613281),
		new Point2D.Double(104.925000, 21.818750),
		new Point2D.Double(105.424219, 22.257031),
		new Point2D.Double(105.652344, 22.486719),
		new Point2D.Double(105.971094, 22.807031),
		new Point2D.Double(106.283594, 23.121094),
		new Point2D.Double(106.522656, 23.424219),
		new Point2D.Double(106.824219, 23.602344),
		new Point2D.Double(107.051563, 23.774219),
		new Point2D.Double(107.217187, 23.884375),
		new Point2D.Double(107.632031, 24.004687),
		new Point2D.Double(107.746094, 24.004687),
		new Point2D.Double(108.308594, 24.067969),
		new Point2D.Double(108.496094, 24.067969),
		new Point2D.Double(109.143750, 24.067969),
		new Point2D.Double(109.414844, 24.067969),
		new Point2D.Double(110.350781, 23.864062),
		new Point2D.Double(111.088281, 23.568750),
		new Point2D.Double(111.729687, 23.211719),
		new Point2D.Double(112.371094, 22.928125),
		new Point2D.Double(112.945312, 22.740625),
		new Point2D.Double(113.059375, 22.683594),
		new Point2D.Double(113.276562, 22.683594),
		new Point2D.Double(113.463281, 22.683594),
		new Point2D.Double(114.104687, 22.683594),
		new Point2D.Double(115.639062, 22.683594),
		new Point2D.Double(117.803125, 22.683594),
		new Point2D.Double(119.358594, 22.446875),
		new Point2D.Double(120.080469, 22.160156),
		new Point2D.Double(120.721875, 21.876562),
		new Point2D.Double(121.284375, 21.521875),
		new Point2D.Double(122.055469, 20.892969),
		new Point2D.Double(122.638281, 20.456250),
		new Point2D.Double(123.521094, 19.721875),
		new Point2D.Double(123.793750, 19.585938),
		new Point2D.Double(124.620312, 19.100000),
		new Point2D.Double(124.995312, 18.912500),
		new Point2D.Double(125.296875, 18.792969),
		new Point2D.Double(125.460156, 18.685938),
		new Point2D.Double(125.625000, 18.628906),
		new Point2D.Double(125.728125, 18.628906),
		new Point2D.Double(126.006250, 18.628906),
		new Point2D.Double(126.119531, 18.628906),
		new Point2D.Double(126.534375, 18.628906),
		new Point2D.Double(126.721875, 18.628906),
		new Point2D.Double(127.283594, 18.628906),
		new Point2D.Double(127.743750, 18.628906),
		new Point2D.Double(128.287500, 18.628906),
		new Point2D.Double(128.745313, 18.628906),
		new Point2D.Double(129.202344, 18.628906),
		new Point2D.Double(129.503906, 18.628906),
		new Point2D.Double(129.731250, 18.686719),
		new Point2D.Double(129.834375, 18.686719),
		new Point2D.Double(130.051562, 18.744531),
		new Point2D.Double(130.165625, 18.802344),
		new Point2D.Double(130.320312, 18.854688),
		new Point2D.Double(130.371875, 18.907031),
		new Point2D.Double(130.525781, 19.010938),
		new Point2D.Double(130.628906, 19.063281),
		new Point2D.Double(130.732031, 19.167969),
		new Point2D.Double(130.783594, 19.220312),
		new Point2D.Double(130.835156, 19.220312),
		new Point2D.Double(130.989062, 19.376562),
		new Point2D.Double(131.192969, 19.531250),
		new Point2D.Double(131.250000, 19.646094),
		new Point2D.Double(131.409375, 19.864844),
		new Point2D.Double(131.460938, 19.917188),
		new Point2D.Double(131.625781, 20.198438),
		new Point2D.Double(131.677344, 20.250781),
		new Point2D.Double(131.910937, 20.668750),
		new Point2D.Double(132.296875, 21.318750),
		new Point2D.Double(132.818750, 22.242188),
		new Point2D.Double(133.000781, 22.545313),
		new Point2D.Double(133.282813, 22.830469),
		new Point2D.Double(133.510156, 23.002344),
		new Point2D.Double(133.738281, 23.117969),
		new Point2D.Double(133.966406, 23.347656),
		new Point2D.Double(134.528125, 23.661719),
		new Point2D.Double(135.175781, 24.050000),
		new Point2D.Double(135.908594, 24.386719),
		new Point2D.Double(136.096094, 24.512500),
		new Point2D.Double(136.742188, 24.707031),
		new Point2D.Double(137.042969, 24.827344),
		new Point2D.Double(137.457031, 24.947656),
		new Point2D.Double(137.684375, 25.004687),
		new Point2D.Double(137.899219, 25.056250),
		new Point2D.Double(138.002344, 25.108594),
		new Point2D.Double(138.167188, 25.165625),
		new Point2D.Double(138.269531, 25.217188),
		new Point2D.Double(138.486719, 25.269531),
		new Point2D.Double(138.600781, 25.327344),
		new Point2D.Double(138.817969, 25.379687),
		new Point2D.Double(139.046094, 25.437500),
		new Point2D.Double(139.325781, 25.605469),
		new Point2D.Double(139.439063, 25.662500),
		new Point2D.Double(139.853125, 25.959375),
		new Point2D.Double(140.153125, 26.198438),
		new Point2D.Double(140.747656, 26.732813),
		new Point2D.Double(140.872656, 26.921094),
		new Point2D.Double(141.430469, 27.690625),
		new Point2D.Double(142.285156, 29.416406),
		new Point2D.Double(142.522656, 29.892969),
		new Point2D.Double(142.999219, 30.905469)

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
