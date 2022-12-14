package org.hccp.jvm.autotune.functions;

import org.hccp.jvm.autotune.Function;

import java.awt.geom.*;

public class Fof008  implements Function {
	public static Point2D.Double[] points = {
				new Point2D.Double(-563.550000, 18.209375),
		new Point2D.Double(-560.253125, 18.209375),
		new Point2D.Double(-556.484375, 18.209375),
		new Point2D.Double(-554.956250, 18.209375),
		new Point2D.Double(-553.240625, 18.209375),
		new Point2D.Double(-551.512500, 18.209375),
		new Point2D.Double(-549.550000, 18.662500),
		new Point2D.Double(-548.478125, 19.100000),
		new Point2D.Double(-547.203125, 19.721875),
		new Point2D.Double(-546.134375, 20.365625),
		new Point2D.Double(-544.362500, 21.262500),
		new Point2D.Double(-542.356250, 22.381250),
		new Point2D.Double(-540.781250, 23.284375),
		new Point2D.Double(-539.009375, 24.615625),
		new Point2D.Double(-536.556250, 26.637500),
		new Point2D.Double(-535.043750, 28.400000),
		new Point2D.Double(-534.021875, 29.231250),
		new Point2D.Double(-533.200000, 29.859375),
		new Point2D.Double(-532.378125, 30.900000),
		new Point2D.Double(-531.512500, 32.234375),
		new Point2D.Double(-530.446875, 33.768750),
		new Point2D.Double(-529.606250, 34.850000),
		new Point2D.Double(-528.562500, 36.137500),
		new Point2D.Double(-528.150000, 37.215625),
		new Point2D.Double(-527.743750, 38.756250),
		new Point2D.Double(-527.293750, 40.625000),
		new Point2D.Double(-526.837500, 43.206250),
		new Point2D.Double(-526.343750, 47.387500),
		new Point2D.Double(-525.353125, 51.593750),
		new Point2D.Double(-524.403125, 54.753125),
		new Point2D.Double(-523.478125, 57.081250),
		new Point2D.Double(-523.059375, 57.734375),
		new Point2D.Double(-522.815625, 61.081250),
		new Point2D.Double(-521.784375, 65.487500),
		new Point2D.Double(-520.537500, 69.296875),
		new Point2D.Double(-519.590625, 71.700000),
		new Point2D.Double(-518.453125, 73.990625),
		new Point2D.Double(-517.300000, 77.028125),
		new Point2D.Double(-516.328125, 80.481250),
		new Point2D.Double(-514.881250, 84.390625),
		new Point2D.Double(-513.393750, 86.634375),
		new Point2D.Double(-513.143750, 97.156250),
		new Point2D.Double(-512.675000, 100.021875),
		new Point2D.Double(-512.468750, 101.100000),
		new Point2D.Double(-512.262500, 103.187500),
		new Point2D.Double(-512.034375, 104.728125),
		new Point2D.Double(-511.556250, 106.850000),
		new Point2D.Double(-510.853125, 110.015625),
		new Point2D.Double(-509.859375, 113.809375),
		new Point2D.Double(-508.553125, 118.575000),
		new Point2D.Double(-505.821875, 123.765625),
		new Point2D.Double(-505.596875, 149.828125),
		new Point2D.Double(-505.346875, 152.990625),
		new Point2D.Double(-504.228125, 158.268750),
		new Point2D.Double(-500.578125, 169.131250),
		new Point2D.Double(-495.415625, 178.993750),
		new Point2D.Double(-494.531250, 180.471875),
		new Point2D.Double(-493.671875, 188.178125),
		new Point2D.Double(-492.803125, 193.650000),
		new Point2D.Double(-491.759375, 198.400000),
		new Point2D.Double(-491.015625, 201.396875),
		new Point2D.Double(-490.046875, 204.850000),
		new Point2D.Double(-489.090625, 207.275000),
		new Point2D.Double(-488.162500, 209.850000),
		new Point2D.Double(-487.006250, 212.428125),
		new Point2D.Double(-484.687500, 215.012500),
		new Point2D.Double(-481.918750, 217.825000),
		new Point2D.Double(-479.190625, 220.121875),
		new Point2D.Double(-476.800000, 221.856250),
		new Point2D.Double(-475.975000, 222.271875),
		new Point2D.Double(-475.787500, 222.271875),
		new Point2D.Double(-475.603125, 222.271875),
		new Point2D.Double(-474.578125, 222.687500),
		new Point2D.Double(-472.803125, 223.356250),
		new Point2D.Double(-471.731250, 223.796875),
		new Point2D.Double(-470.453125, 224.421875),
		new Point2D.Double(-468.265625, 225.740625),
		new Point2D.Double(-465.784375, 226.643750),
		new Point2D.Double(-463.503125, 227.800000),
		new Point2D.Double(-459.915625, 229.237500),
		new Point2D.Double(-457.509375, 230.678125),
		new Point2D.Double(-454.959375, 232.071875),
		new Point2D.Double(-452.853125, 233.690625),
		new Point2D.Double(-450.000000, 235.809375),
		new Point2D.Double(-447.890625, 237.228125),
		new Point2D.Double(-445.337500, 238.846875),
		new Point2D.Double(-443.525000, 239.990625),
		new Point2D.Double(-441.259375, 241.815625),
		new Point2D.Double(-438.656250, 244.184375),
		new Point2D.Double(-436.859375, 246.221875),
		new Point2D.Double(-435.581250, 247.975000),
		new Point2D.Double(-435.178125, 248.593750),
		new Point2D.Double(-434.990625, 249.168750),
		new Point2D.Double(-433.884375, 251.656250),
		new Point2D.Double(-432.753125, 253.984375),
		new Point2D.Double(-431.640625, 255.559375),
		new Point2D.Double(-430.121875, 256.640625),
		new Point2D.Double(-429.050000, 257.081250),
		new Point2D.Double(-428.843750, 257.081250),
		new Point2D.Double(-428.021875, 257.081250),
		new Point2D.Double(-426.493750, 257.081250),
		new Point2D.Double(-424.706250, 255.290625),
		new Point2D.Double(-422.240625, 250.840625),
		new Point2D.Double(-419.915625, 246.428125),
		new Point2D.Double(-416.981250, 242.206250),
		new Point2D.Double(-414.415625, 240.140625),
		new Point2D.Double(-411.393750, 238.921875),
		new Point2D.Double(-406.300000, 238.650000),
		new Point2D.Double(-401.946875, 238.650000),
		new Point2D.Double(-399.256250, 240.115625),
		new Point2D.Double(-395.818750, 244.400000),
		new Point2D.Double(-392.934375, 251.712500),
		new Point2D.Double(-389.509375, 260.918750),
		new Point2D.Double(-385.787500, 269.934375),
		new Point2D.Double(-382.203125, 276.881250),
		new Point2D.Double(-381.287500, 278.275000),
		new Point2D.Double(-381.015625, 282.459375),
		new Point2D.Double(-379.643750, 288.281250),
		new Point2D.Double(-378.290625, 293.718750),
		new Point2D.Double(-376.665625, 299.215625),
		new Point2D.Double(-375.690625, 302.390625),
		new Point2D.Double(-374.534375, 305.431250),
		new Point2D.Double(-373.565625, 308.587500),
		new Point2D.Double(-372.150000, 312.187500),
		new Point2D.Double(-371.225000, 314.300000),
		new Point2D.Double(-370.093750, 316.628125),
		new Point2D.Double(-369.187500, 318.456250),
		new Point2D.Double(-368.531250, 319.784375),
		new Point2D.Double(-368.121875, 320.868750),
		new Point2D.Double(-367.928125, 321.262500),
		new Point2D.Double(-367.700000, 321.912500),
		new Point2D.Double(-367.040625, 323.909375),
		new Point2D.Double(-366.362500, 325.693750),
		new Point2D.Double(-365.496875, 327.687500),
		new Point2D.Double(-364.406250, 329.478125),
		new Point2D.Double(-363.296875, 331.509375),
		new Point2D.Double(-362.009375, 333.040625),
		new Point2D.Double(-361.396875, 333.662500),
		new Point2D.Double(-360.803125, 334.265625),
		new Point2D.Double(-360.187500, 334.887500),
		new Point2D.Double(-359.162500, 335.718750),
		new Point2D.Double(-357.934375, 336.753125),
		new Point2D.Double(-356.906250, 337.378125),
		new Point2D.Double(-356.103125, 337.984375),
		new Point2D.Double(-354.871875, 338.818750),
		new Point2D.Double(-353.578125, 339.921875),
		new Point2D.Double(-352.100000, 340.968750),
		new Point2D.Double(-351.075000, 341.387500),
		new Point2D.Double(-350.668750, 341.787500),
		new Point2D.Double(-350.065625, 342.393750),
		new Point2D.Double(-349.462500, 343.006250),
		new Point2D.Double(-348.440625, 343.837500),
		new Point2D.Double(-347.128125, 344.709375),
		new Point2D.Double(-345.618750, 345.578125),
		new Point2D.Double(-344.096875, 346.225000),
		new Point2D.Double(-342.575000, 346.434375),
		new Point2D.Double(-341.106250, 346.434375),
		new Point2D.Double(-340.306250, 346.434375),
		new Point2D.Double(-339.909375, 346.434375),
		new Point2D.Double(-339.518750, 346.434375),
		new Point2D.Double(-339.137500, 346.434375),
		new Point2D.Double(-338.543750, 346.640625),
		new Point2D.Double(-337.940625, 346.640625),
		new Point2D.Double(-337.553125, 346.837500),
		new Point2D.Double(-336.962500, 347.046875),
		new Point2D.Double(-336.359375, 347.256250),
		new Point2D.Double(-335.762500, 347.456250),
		new Point2D.Double(-335.178125, 347.656250),
		new Point2D.Double(-334.793750, 347.656250),
		new Point2D.Double(-334.215625, 347.656250),
		new Point2D.Double(-333.403125, 347.656250),
		new Point2D.Double(-332.175000, 347.656250),
		new Point2D.Double(-331.109375, 347.656250),
		new Point2D.Double(-329.590625, 347.656250),
		new Point2D.Double(-327.821875, 347.656250),
		new Point2D.Double(-326.503125, 347.656250),
		new Point2D.Double(-324.978125, 347.656250),
		new Point2D.Double(-324.159375, 347.656250),
		new Point2D.Double(-323.140625, 347.246875),
		new Point2D.Double(-322.321875, 347.043750),
		new Point2D.Double(-321.296875, 346.431250),
		new Point2D.Double(-319.862500, 346.021875),
		new Point2D.Double(-319.262500, 345.815625),
		new Point2D.Double(-318.668750, 345.612500),
		new Point2D.Double(-318.275000, 345.612500),
		new Point2D.Double(-317.906250, 345.418750),
		new Point2D.Double(-316.628125, 344.987500),
		new Point2D.Double(-315.600000, 344.165625),
		new Point2D.Double(-314.775000, 343.550000),
		new Point2D.Double(-313.750000, 342.525000),
		new Point2D.Double(-312.931250, 341.706250),
		new Point2D.Double(-312.321875, 340.684375),
		new Point2D.Double(-312.118750, 340.275000),
		new Point2D.Double(-311.931250, 340.275000),
		new Point2D.Double(-311.743750, 340.068750),
		new Point2D.Double(-310.715625, 339.250000),
		new Point2D.Double(-309.687500, 338.221875),
		new Point2D.Double(-308.162500, 336.240625),
		new Point2D.Double(-306.121875, 333.059375),
		new Point2D.Double(-304.600000, 330.628125),
		new Point2D.Double(-303.575000, 329.603125),
		new Point2D.Double(-302.525000, 328.325000),
		new Point2D.Double(-300.975000, 327.003125),
		new Point2D.Double(-299.700000, 325.956250),
		new Point2D.Double(-298.878125, 325.134375),
		new Point2D.Double(-297.112500, 323.818750),
		new Point2D.Double(-295.550000, 322.256250),
		new Point2D.Double(-292.484375, 319.190625),
		new Point2D.Double(-289.515625, 315.946875),
		new Point2D.Double(-288.400000, 314.375000),
		new Point2D.Double(-287.312500, 312.606250),
		new Point2D.Double(-286.262500, 311.328125),
		new Point2D.Double(-285.440625, 310.506250),
		new Point2D.Double(-284.821875, 309.890625),
		new Point2D.Double(-284.000000, 309.071875),
		new Point2D.Double(-283.381250, 308.246875),
		new Point2D.Double(-282.331250, 306.968750),
		new Point2D.Double(-280.759375, 304.943750),
		new Point2D.Double(-279.412500, 303.368750),
		new Point2D.Double(-278.134375, 301.634375),
		new Point2D.Double(-276.831250, 300.331250),
		new Point2D.Double(-275.571875, 298.843750),
		new Point2D.Double(-274.500000, 297.315625),
		new Point2D.Double(-272.993750, 295.581250),
		new Point2D.Double(-272.168750, 294.756250),
		new Point2D.Double(-271.346875, 293.728125),
		new Point2D.Double(-270.325000, 292.293750),
		new Point2D.Double(-269.293750, 291.262500),
		new Point2D.Double(-268.471875, 291.056250),
		new Point2D.Double(-267.750000, 277.315625),
		new Point2D.Double(-266.509375, 273.543750),
		new Point2D.Double(-264.409375, 267.709375),
		new Point2D.Double(-262.075000, 263.012500),
		new Point2D.Double(-259.531250, 258.921875),
		new Point2D.Double(-257.212500, 254.528125),
		new Point2D.Double(-254.059375, 250.328125),
		new Point2D.Double(-251.768750, 247.287500),
		new Point2D.Double(-248.271875, 242.996875),
		new Point2D.Double(-244.531250, 239.262500),
		new Point2D.Double(-240.225000, 235.703125),
		new Point2D.Double(-237.037500, 233.009375),
		new Point2D.Double(-232.278125, 229.040625),
		new Point2D.Double(-223.334375, 221.600000),
		new Point2D.Double(-217.428125, 216.287500),
		new Point2D.Double(-214.421875, 213.281250),
		new Point2D.Double(-213.575000, 212.206250),
		new Point2D.Double(-213.368750, 212.206250),
		new Point2D.Double(-209.443750, 204.603125),
		new Point2D.Double(-202.693750, 196.937500),
		new Point2D.Double(-193.225000, 189.406250),
		new Point2D.Double(-185.562500, 183.209375),
		new Point2D.Double(-177.968750, 176.159375),
		new Point2D.Double(-173.950000, 172.634375),
		new Point2D.Double(-172.178125, 171.318750),
		new Point2D.Double(-171.768750, 171.115625),
		new Point2D.Double(-166.771875, 165.834375),
		new Point2D.Double(-160.465625, 160.656250),
		new Point2D.Double(-156.278125, 157.853125),
		new Point2D.Double(-152.906250, 155.509375),
		new Point2D.Double(-150.056250, 153.381250),
		new Point2D.Double(-148.243750, 152.253125),
		new Point2D.Double(-145.681250, 150.165625),
		new Point2D.Double(-142.468750, 147.446875),
		new Point2D.Double(-139.556250, 144.784375),
		new Point2D.Double(-137.740625, 142.968750),
		new Point2D.Double(-135.971875, 140.975000),
		new Point2D.Double(-135.559375, 140.562500),
		new Point2D.Double(-135.003125, 140.562500),
		new Point2D.Double(-128.978125, 136.693750),
		new Point2D.Double(-124.000000, 133.012500),
		new Point2D.Double(-117.715625, 130.025000),
		new Point2D.Double(-107.940625, 127.065625),
		new Point2D.Double(-100.190625, 124.709375),
		new Point2D.Double(-94.375000, 122.384375),
		new Point2D.Double(-87.815625, 119.546875),
		new Point2D.Double(-85.096875, 117.834375),
		new Point2D.Double(-84.640625, 117.606250),
		new Point2D.Double(-83.568750, 116.968750),
		new Point2D.Double(-83.200000, 116.968750),
		new Point2D.Double(-78.803125, 114.943750),
		new Point2D.Double(-74.734375, 112.665625),
		new Point2D.Double(-73.984375, 112.165625),
		new Point2D.Double(-70.662500, 110.137500),
		new Point2D.Double(-65.731250, 106.840625),
		new Point2D.Double(-59.146875, 103.390625),
		new Point2D.Double(-51.709375, 100.409375),
		new Point2D.Double(-43.137500, 97.384375),
		new Point2D.Double(-34.759375, 95.068750),
		new Point2D.Double(-32.506250, 93.090625),
		new Point2D.Double(-32.321875, 93.090625),
		new Point2D.Double(-25.050000, 90.296875),
		new Point2D.Double(-18.890625, 87.890625),
		new Point2D.Double(-14.146875, 86.040625),
		new Point2D.Double(-6.296875, 82.712500),
		new Point2D.Double(-1.134375, 80.712500),
		new Point2D.Double(4.000000, 78.859375),
		new Point2D.Double(7.896875, 77.409375),
		new Point2D.Double(11.209375, 76.006250),
		new Point2D.Double(14.690625, 74.787500),
		new Point2D.Double(18.756250, 73.528125),
		new Point2D.Double(22.490625, 72.034375),
		new Point2D.Double(25.850000, 70.606250),
		new Point2D.Double(26.668750, 70.606250),
		new Point2D.Double(27.053125, 70.606250),
		new Point2D.Double(27.640625, 70.815625),
		new Point2D.Double(30.996875, 73.440625),
		new Point2D.Double(35.128125, 76.303125),
		new Point2D.Double(38.115625, 78.306250),
		new Point2D.Double(40.968750, 80.678125),
		new Point2D.Double(43.534375, 83.009375),
		new Point2D.Double(45.359375, 84.846875),
		new Point2D.Double(47.478125, 87.731250),
		new Point2D.Double(49.531250, 90.028125),
		new Point2D.Double(52.606250, 93.121875),
		new Point2D.Double(56.946875, 96.731250),
		new Point2D.Double(61.053125, 100.606250),
		new Point2D.Double(63.840625, 103.887500),
		new Point2D.Double(65.434375, 106.181250),
		new Point2D.Double(67.256250, 108.471875),
		new Point2D.Double(68.621875, 110.765625),
		new Point2D.Double(70.078125, 113.190625),
		new Point2D.Double(71.506250, 116.356250),
		new Point2D.Double(73.006250, 120.168750),
		new Point2D.Double(75.865625, 127.215625),
		new Point2D.Double(77.390625, 130.365625),
		new Point2D.Double(78.325000, 130.365625),
		new Point2D.Double(85.365625, 131.681250),
		new Point2D.Double(91.912500, 132.837500),
		new Point2D.Double(98.475000, 134.203125),
		new Point2D.Double(101.912500, 134.706250),
		new Point2D.Double(104.640625, 134.937500),
		new Point2D.Double(108.234375, 134.937500),
		new Point2D.Double(112.303125, 134.175000),
		new Point2D.Double(116.618750, 132.293750),
		new Point2D.Double(123.878125, 127.153125),
		new Point2D.Double(130.075000, 122.146875),
		new Point2D.Double(139.337500, 115.528125),
		new Point2D.Double(147.300000, 109.528125),
		new Point2D.Double(152.471875, 104.346875),
		new Point2D.Double(154.365625, 102.225000),
		new Point2D.Double(154.568750, 101.815625),
		new Point2D.Double(155.315625, 101.815625),
		new Point2D.Double(166.859375, 98.871875),
		new Point2D.Double(175.909375, 95.775000),
		new Point2D.Double(182.834375, 92.900000),
		new Point2D.Double(188.512500, 90.278125),
		new Point2D.Double(198.431250, 85.493750),
		new Point2D.Double(210.009375, 79.696875),
		new Point2D.Double(219.346875, 75.787500),
		new Point2D.Double(222.506250, 75.037500),
		new Point2D.Double(222.712500, 75.037500),
		new Point2D.Double(222.896875, 75.037500),
		new Point2D.Double(231.675000, 75.037500),
		new Point2D.Double(242.581250, 72.721875),
		new Point2D.Double(253.350000, 69.678125),
		new Point2D.Double(258.106250, 68.862500),
		new Point2D.Double(260.962500, 68.862500),
		new Point2D.Double(264.437500, 70.259375),
		new Point2D.Double(269.878125, 71.750000),
		new Point2D.Double(273.315625, 72.234375),
		new Point2D.Double(275.793750, 72.906250),
		new Point2D.Double(277.318750, 73.553125),
		new Point2D.Double(277.731250, 74.387500),
		new Point2D.Double(278.406250, 76.546875),
		new Point2D.Double(279.693750, 81.718750),
		new Point2D.Double(280.750000, 85.709375),
		new Point2D.Double(282.990625, 92.265625),
		new Point2D.Double(285.631250, 98.125000),
		new Point2D.Double(290.490625, 106.706250),
		new Point2D.Double(296.628125, 117.978125),
		new Point2D.Double(301.103125, 125.059375),
		new Point2D.Double(305.168750, 131.768750),
		new Point2D.Double(308.700000, 136.159375),
		new Point2D.Double(310.834375, 138.084375),
		new Point2D.Double(312.153125, 138.290625),
		new Point2D.Double(313.668750, 138.496875),
		new Point2D.Double(315.937500, 138.496875),
		new Point2D.Double(319.121875, 136.550000),
		new Point2D.Double(322.178125, 132.653125),
		new Point2D.Double(326.590625, 126.862500),
		new Point2D.Double(329.140625, 124.059375),
		new Point2D.Double(334.653125, 117.706250),
		new Point2D.Double(337.778125, 113.834375),
		new Point2D.Double(340.325000, 110.353125),
		new Point2D.Double(343.390625, 104.375000),
		new Point2D.Double(344.909375, 99.496875),
		new Point2D.Double(345.278125, 98.021875),
		new Point2D.Double(350.696875, 94.012500),
		new Point2D.Double(358.225000, 88.868750),
		new Point2D.Double(364.968750, 84.471875),
		new Point2D.Double(371.421875, 80.353125),
		new Point2D.Double(375.678125, 76.878125),
		new Point2D.Double(378.534375, 74.771875),
		new Point2D.Double(382.306250, 72.781250),
		new Point2D.Double(387.025000, 70.843750),
		new Point2D.Double(393.684375, 67.368750),
		new Point2D.Double(398.087500, 65.050000),
		new Point2D.Double(402.268750, 62.359375),
		new Point2D.Double(407.487500, 57.390625),
		new Point2D.Double(410.296875, 52.806250),
		new Point2D.Double(410.853125, 51.603125),
		new Point2D.Double(418.990625, 41.859375),
		new Point2D.Double(424.800000, 33.159375),
		new Point2D.Double(428.234375, 29.234375),
		new Point2D.Double(431.093750, 27.353125),
		new Point2D.Double(432.668750, 26.462500),
		new Point2D.Double(434.690625, 25.806250),
		new Point2D.Double(437.009375, 25.328125),
		new Point2D.Double(440.159375, 25.078125),
		new Point2D.Double(442.721875, 24.600000),
		new Point2D.Double(444.000000, 24.600000),
		new Point2D.Double(445.575000, 24.600000),
		new Point2D.Double(448.728125, 26.275000),
		new Point2D.Double(449.478125, 26.528125),
		new Point2D.Double(452.640625, 28.228125),
		new Point2D.Double(456.800000, 31.106250),
		new Point2D.Double(460.662500, 35.534375),
		new Point2D.Double(464.496875, 41.575000),
		new Point2D.Double(467.037500, 46.471875),
		new Point2D.Double(469.475000, 49.425000),
		new Point2D.Double(473.000000, 52.215625),
		new Point2D.Double(476.746875, 53.978125),
		new Point2D.Double(480.656250, 54.481250),
		new Point2D.Double(484.728125, 54.481250),
		new Point2D.Double(487.303125, 53.068750),
		new Point2D.Double(490.334375, 50.515625),
		new Point2D.Double(494.221875, 46.081250),
		new Point2D.Double(498.256250, 38.296875),
		new Point2D.Double(500.115625, 33.525000),
		new Point2D.Double(500.340625, 31.868750),
		new Point2D.Double(500.525000, 31.868750),
		new Point2D.Double(502.546875, 31.662500),
		new Point2D.Double(504.768750, 30.800000),
		new Point2D.Double(506.540625, 30.118750),
		new Point2D.Double(508.106250, 29.440625),
		new Point2D.Double(510.378125, 28.759375),
		new Point2D.Double(512.946875, 28.281250),
		new Point2D.Double(515.215625, 27.603125),
		new Point2D.Double(518.893750, 26.925000),
		new Point2D.Double(524.178125, 26.431250),
		new Point2D.Double(528.271875, 25.703125),
		new Point2D.Double(529.803125, 25.246875),
		new Point2D.Double(530.625000, 24.837500),
		new Point2D.Double(531.900000, 24.406250),
		new Point2D.Double(533.428125, 23.768750),
		new Point2D.Double(535.703125, 22.859375),
		new Point2D.Double(537.975000, 21.725000),
		new Point2D.Double(539.753125, 20.631250),
		new Point2D.Double(540.565625, 20.425000),
		new Point2D.Double(540.753125, 20.425000),
		new Point2D.Double(542.078125, 20.425000),
		new Point2D.Double(544.550000, 20.425000),
		new Point2D.Double(546.031250, 20.425000),
		new Point2D.Double(549.509375, 21.596875),
		new Point2D.Double(551.740625, 22.056250),
		new Point2D.Double(553.018750, 22.262500),
		new Point2D.Double(554.300000, 22.493750),
		new Point2D.Double(555.331250, 22.493750),
		new Point2D.Double(556.362500, 22.493750),
		new Point2D.Double(557.393750, 22.493750),
		new Point2D.Double(558.218750, 22.493750),
		new Point2D.Double(558.596875, 22.493750),
		new Point2D.Double(560.540625, 21.831250),
		new Point2D.Double(562.440625, 20.778125),
		new Point2D.Double(563.884375, 19.540625),
		new Point2D.Double(565.415625, 18.465625),
		new Point2D.Double(567.150000, 16.959375),
		new Point2D.Double(568.475000, 15.178125),
		new Point2D.Double(569.887500, 12.309375),
		new Point2D.Double(571.006250, 10.528125),
		new Point2D.Double(571.418750, 9.909375),
		new Point2D.Double(571.800000, 9.909375),
		new Point2D.Double(572.184375, 9.909375),
		new Point2D.Double(572.996875, 10.118750),
		new Point2D.Double(574.481250, 10.978125),
		new Point2D.Double(575.196875, 11.859375)

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
