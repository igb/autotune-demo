package com.twitter.jvm.autotune.functions;


import com.twitter.jvm.autotune.Function;

import java.awt.geom.*;



public class Fof001 implements Function {
	public static Point2D.Double[] points = {
		new Point2D.Double(-2.005493, 0.049023),
		new Point2D.Double(-1.996753, 0.054419),
		new Point2D.Double(-1.989990, 0.059473),
		new Point2D.Double(-1.982959, 0.064795),
		new Point2D.Double(-1.975830, 0.071973),
		new Point2D.Double(-1.972290, 0.075537),
		new Point2D.Double(-1.968799, 0.079053),
		new Point2D.Double(-1.965234, 0.080859),
		new Point2D.Double(-1.961694, 0.084424),
		new Point2D.Double(-1.958203, 0.087939),
		new Point2D.Double(-1.954639, 0.091528),
		new Point2D.Double(-1.951074, 0.093335),
		new Point2D.Double(-1.947534, 0.096899),
		new Point2D.Double(-1.944043, 0.100415),
		new Point2D.Double(-1.940479, 0.104004),
		new Point2D.Double(-1.934619, 0.107935),
		new Point2D.Double(-1.931079, 0.111499),
		new Point2D.Double(-1.924878, 0.117725),
		new Point2D.Double(-1.921313, 0.121313),
		new Point2D.Double(-1.914966, 0.127686),
		new Point2D.Double(-1.911182, 0.133398),
		new Point2D.Double(-1.904785, 0.139819),
		new Point2D.Double(-1.900879, 0.145703),
		new Point2D.Double(-1.893994, 0.154907),
		new Point2D.Double(-1.890088, 0.160791),
		new Point2D.Double(-1.876514, 0.178955),
		new Point2D.Double(-1.869653, 0.188135),
		new Point2D.Double(-1.865747, 0.194019),
		new Point2D.Double(-1.859351, 0.200439),
		new Point2D.Double(-1.855591, 0.206128),
		new Point2D.Double(-1.851685, 0.212012),
		new Point2D.Double(-1.847803, 0.217871),
		new Point2D.Double(-1.841528, 0.224170),
		new Point2D.Double(-1.838062, 0.227661),
		new Point2D.Double(-1.834155, 0.233545),
		new Point2D.Double(-1.832202, 0.239429),
		new Point2D.Double(-1.828687, 0.242969),
		new Point2D.Double(-1.824854, 0.248755),
		new Point2D.Double(-1.821289, 0.252344),
		new Point2D.Double(-1.817383, 0.258228),
		new Point2D.Double(-1.815649, 0.261743),
		new Point2D.Double(-1.811743, 0.267627),
		new Point2D.Double(-1.808203, 0.271191),
		new Point2D.Double(-1.804663, 0.274756),
		new Point2D.Double(-1.800757, 0.280640),
		new Point2D.Double(-1.796973, 0.286328),
		new Point2D.Double(-1.793066, 0.292212),
		new Point2D.Double(-1.786694, 0.298608),
		new Point2D.Double(-1.782861, 0.304370),
		new Point2D.Double(-1.772095, 0.319409),
		new Point2D.Double(-1.765771, 0.325757),
		new Point2D.Double(-1.759058, 0.334741),
		new Point2D.Double(-1.755151, 0.340625),
		new Point2D.Double(-1.748242, 0.349878),
		new Point2D.Double(-1.744385, 0.355713),
		new Point2D.Double(-1.737744, 0.364600),
		new Point2D.Double(-1.733838, 0.370483),
		new Point2D.Double(-1.726929, 0.379736),
		new Point2D.Double(-1.723022, 0.385620),
		new Point2D.Double(-1.718921, 0.393872),
		new Point2D.Double(-1.715015, 0.399756),
		new Point2D.Double(-1.708105, 0.409009),
		new Point2D.Double(-1.703931, 0.417407),
		new Point2D.Double(-1.699683, 0.425952),
		new Point2D.Double(-1.692969, 0.434937),
		new Point2D.Double(-1.685620, 0.449683),
		new Point2D.Double(-1.681714, 0.455566),
		new Point2D.Double(-1.674805, 0.467114),
		new Point2D.Double(-1.670190, 0.478662),
		new Point2D.Double(-1.663306, 0.490161),
		new Point2D.Double(-1.656714, 0.501196),
		new Point2D.Double(-1.645557, 0.518994),
		new Point2D.Double(-1.641309, 0.527539),
		new Point2D.Double(-1.634668, 0.536426),
		new Point2D.Double(-1.627759, 0.545679),
		new Point2D.Double(-1.621387, 0.552075),
		new Point2D.Double(-1.614478, 0.561328),
		new Point2D.Double(-1.607617, 0.570508),
		new Point2D.Double(-1.598804, 0.577148),
		new Point2D.Double(-1.591895, 0.586401),
		new Point2D.Double(-1.582690, 0.595630),
		new Point2D.Double(-1.573535, 0.604810),
		new Point2D.Double(-1.564722, 0.613647),
		new Point2D.Double(-1.548584, 0.629834),
		new Point2D.Double(-1.539380, 0.639062),
		new Point2D.Double(-1.533228, 0.645239),
		new Point2D.Double(-1.520459, 0.658057),
		new Point2D.Double(-1.514600, 0.661987),
		new Point2D.Double(-1.511035, 0.665576),
		new Point2D.Double(-1.504004, 0.669141),
		new Point2D.Double(-1.500439, 0.670947),
		new Point2D.Double(-1.498853, 0.670947),
		new Point2D.Double(-1.497266, 0.670947),
		new Point2D.Double(-1.493701, 0.670947),
		new Point2D.Double(-1.492090, 0.670947),
		new Point2D.Double(-1.490503, 0.670947),
		new Point2D.Double(-1.488916, 0.670947),
		new Point2D.Double(-1.487305, 0.670947),
		new Point2D.Double(-1.485693, 0.670947),
		new Point2D.Double(-1.484106, 0.670947),
		new Point2D.Double(-1.482495, 0.669336),
		new Point2D.Double(-1.480713, 0.664185),
		new Point2D.Double(-1.478931, 0.655469),
		new Point2D.Double(-1.477148, 0.589746),
		new Point2D.Double(-1.475195, 0.572314),
		new Point2D.Double(-1.472974, 0.544214),
		new Point2D.Double(-1.470703, 0.515771),
		new Point2D.Double(-1.466357, 0.496118),
		new Point2D.Double(-1.464063, 0.484644),
		new Point2D.Double(-1.461963, 0.476172),
		new Point2D.Double(-1.459741, 0.465039),
		new Point2D.Double(-1.455493, 0.456519),
		new Point2D.Double(-1.451294, 0.448120),
		new Point2D.Double(-1.447388, 0.442261),
		new Point2D.Double(-1.443286, 0.434058),
		new Point2D.Double(-1.439380, 0.428198),
		new Point2D.Double(-1.435522, 0.422412),
		new Point2D.Double(-1.431616, 0.416553),
		new Point2D.Double(-1.427808, 0.410840),
		new Point2D.Double(-1.423901, 0.404980),
		new Point2D.Double(-1.419678, 0.396509),
		new Point2D.Double(-1.417725, 0.390649),
		new Point2D.Double(-1.413940, 0.384985),
		new Point2D.Double(-1.411987, 0.379126),
		new Point2D.Double(-1.408081, 0.373267),
		new Point2D.Double(-1.406299, 0.369702),
		new Point2D.Double(-1.404370, 0.363867),
		new Point2D.Double(-1.402490, 0.358203),
		new Point2D.Double(-1.391211, 0.344067),
		new Point2D.Double(-1.371924, 0.355103),
		new Point2D.Double(-1.357324, 0.362427),
		new Point2D.Double(-1.348096, 0.369360),
		new Point2D.Double(-1.320190, 0.384888),
		new Point2D.Double(-1.300391, 0.396216),
		new Point2D.Double(-1.281567, 0.406982),
		new Point2D.Double(-1.261768, 0.418311),
		new Point2D.Double(-1.242285, 0.429468),
		new Point2D.Double(-1.219653, 0.440796),
		new Point2D.Double(-1.200244, 0.454688),
		new Point2D.Double(-1.180957, 0.465723),
		new Point2D.Double(-1.169434, 0.472656),
		new Point2D.Double(-1.141235, 0.491479),
		new Point2D.Double(-1.125439, 0.502026),
		new Point2D.Double(-1.119214, 0.508276),
		new Point2D.Double(-1.093799, 0.527368),
		new Point2D.Double(-1.083203, 0.543311),
		new Point2D.Double(-1.069946, 0.556592),
		new Point2D.Double(-1.047949, 0.595142),
		new Point2D.Double(-1.036646, 0.614966),
		new Point2D.Double(-1.025342, 0.637622),
		new Point2D.Double(-1.010327, 0.661670),
		new Point2D.Double(-0.999072, 0.684204),
		new Point2D.Double(-0.984839, 0.707007),
		new Point2D.Double(-0.973535, 0.729663),
		new Point2D.Double(-0.958643, 0.753516),
		new Point2D.Double(-0.947437, 0.775977),
		new Point2D.Double(-0.931665, 0.807568),
		new Point2D.Double(-0.920361, 0.830225),
		new Point2D.Double(-0.909009, 0.855786),
		new Point2D.Double(-0.896997, 0.882837),
		new Point2D.Double(-0.885107, 0.909619),
		new Point2D.Double(-0.869702, 0.942773),
		new Point2D.Double(-0.852075, 0.981592),
		new Point2D.Double(-0.840771, 1.004248),
		new Point2D.Double(-0.832910, 1.022632),
		new Point2D.Double(-0.824878, 1.044092),
		new Point2D.Double(-0.817969, 1.055640),
		new Point2D.Double(-0.805957, 1.082690),
		new Point2D.Double(-0.794897, 1.102051),
		new Point2D.Double(-0.790405, 1.113330),
		new Point2D.Double(-0.782983, 1.128223),
		new Point2D.Double(-0.776074, 1.139771),
		new Point2D.Double(-0.768652, 1.154663),
		new Point2D.Double(-0.762012, 1.165771),
		new Point2D.Double(-0.755103, 1.175024),
		new Point2D.Double(-0.748218, 1.184229),
		new Point2D.Double(-0.743604, 1.195776),
		new Point2D.Double(-0.736963, 1.204663),
		new Point2D.Double(-0.732715, 1.213208),
		new Point2D.Double(-0.724243, 1.230249),
		new Point2D.Double(-0.720337, 1.236133),
		new Point2D.Double(-0.718286, 1.244360),
		new Point2D.Double(-0.716333, 1.250244),
		new Point2D.Double(-0.714380, 1.256128),
		new Point2D.Double(-0.712427, 1.262012),
		new Point2D.Double(-0.710498, 1.267847),
		new Point2D.Double(-0.708716, 1.277246),
		new Point2D.Double(-0.706982, 1.290234),
		new Point2D.Double(-0.705029, 1.309375),
		new Point2D.Double(-0.701147, 1.315234),
		new Point2D.Double(-0.694849, 1.321558),
		new Point2D.Double(-0.690942, 1.327441),
		new Point2D.Double(-0.687402, 1.331006),
		new Point2D.Double(-0.683838, 1.334595),
		new Point2D.Double(-0.680029, 1.340356),
		new Point2D.Double(-0.674170, 1.344287),
		new Point2D.Double(-0.670630, 1.347852),
		new Point2D.Double(-0.669019, 1.349487),
		new Point2D.Double(-0.667432, 1.351099),
		new Point2D.Double(-0.664233, 1.352710),
		new Point2D.Double(-0.662646, 1.352710),
		new Point2D.Double(-0.660669, 1.132275),
		new Point2D.Double(-0.656421, 1.123755),
		new Point2D.Double(-0.644946, 1.097925),
		new Point2D.Double(-0.637524, 1.083057),
		new Point2D.Double(-0.633423, 1.074829),
		new Point2D.Double(-0.626001, 1.059961),
		new Point2D.Double(-0.618823, 1.045605),
		new Point2D.Double(-0.604688, 1.025806),
		new Point2D.Double(-0.602661, 1.017676),
		new Point2D.Double(-0.595239, 1.002808),
		new Point2D.Double(-0.588696, 0.991895),
		new Point2D.Double(-0.584082, 0.980371),
		new Point2D.Double(-0.576392, 0.959814),
		new Point2D.Double(-0.569702, 0.939868),
		new Point2D.Double(-0.565088, 0.928345),
		new Point2D.Double(-0.560400, 0.914282),
		new Point2D.Double(-0.555786, 0.902759),
		new Point2D.Double(-0.553687, 0.894312),
		new Point2D.Double(-0.549072, 0.882788),
		new Point2D.Double(-0.547046, 0.874634),
		new Point2D.Double(-0.543140, 0.868774),
		new Point2D.Double(-0.538940, 0.860352),
		new Point2D.Double(-0.537036, 0.854614),
		new Point2D.Double(-0.532788, 0.846094),
		new Point2D.Double(-0.531006, 0.842529),
		new Point2D.Double(-0.527100, 0.836670),
		new Point2D.Double(-0.525171, 0.830835),
		new Point2D.Double(-0.523389, 0.827271),
		new Point2D.Double(-0.519897, 0.823779),
		new Point2D.Double(-0.518286, 0.822168),
		new Point2D.Double(-0.516675, 0.820557),
		new Point2D.Double(-0.515063, 0.818945),
		new Point2D.Double(-0.509253, 0.814160),
		new Point2D.Double(-0.500757, 0.814160),
		new Point2D.Double(-0.489673, 0.814160),
		new Point2D.Double(-0.478149, 0.814160),
		new Point2D.Double(-0.459985, 0.814160),
		new Point2D.Double(-0.451465, 0.814160),
		new Point2D.Double(-0.429980, 0.814160),
		new Point2D.Double(-0.421460, 0.814160),
		new Point2D.Double(-0.406592, 0.814160),
		new Point2D.Double(-0.384180, 0.816968),
		new Point2D.Double(-0.378516, 0.820776),
		new Point2D.Double(-0.363647, 0.825757),
		new Point2D.Double(-0.344043, 0.836987),
		new Point2D.Double(-0.331689, 0.846875),
		new Point2D.Double(-0.319385, 0.859204),
		new Point2D.Double(-0.295532, 0.891064),
		new Point2D.Double(-0.280542, 0.915088),
		new Point2D.Double(-0.269702, 0.936792),
		new Point2D.Double(-0.254688, 0.960840),
		new Point2D.Double(-0.243506, 0.983228),
		new Point2D.Double(-0.231494, 1.010278),
		new Point2D.Double(-0.215771, 1.041748),
		new Point2D.Double(-0.203076, 1.073535),
		new Point2D.Double(-0.186328, 1.107080),
		new Point2D.Double(-0.169751, 1.140283),
		new Point2D.Double(-0.153149, 1.176831),
		new Point2D.Double(-0.136401, 1.210376),
		new Point2D.Double(-0.118774, 1.249194),
		new Point2D.Double(-0.102026, 1.282739),
		new Point2D.Double(-0.084692, 1.324365),
		new Point2D.Double(-0.071289, 1.361255),
		new Point2D.Double(-0.052783, 1.405688),
		new Point2D.Double(-0.035400, 1.443970),
		new Point2D.Double(-0.022485, 1.479517),
		new Point2D.Double(-0.005737, 1.513062),
		new Point2D.Double(0.020190, 1.581323),
		new Point2D.Double(0.031470, 1.606714),
		new Point2D.Double(0.036426, 1.621606),
		new Point2D.Double(0.044775, 1.643896),
		new Point2D.Double(0.053247, 1.666553),
		new Point2D.Double(0.057983, 1.680786),
		new Point2D.Double(0.060278, 1.692334),
		new Point2D.Double(0.062402, 1.700854),
		new Point2D.Double(0.064917, 1.734473),
		new Point2D.Double(0.069531, 1.746021),
		new Point2D.Double(0.073755, 1.754517),
		new Point2D.Double(0.081714, 1.773120),
		new Point2D.Double(0.088916, 1.787549),
		new Point2D.Double(0.093408, 1.798828),
		new Point2D.Double(0.098364, 1.813721),
		new Point2D.Double(0.105786, 1.828613),
		new Point2D.Double(0.112671, 1.840137),
		new Point2D.Double(0.117163, 1.851392),
		new Point2D.Double(0.121411, 1.859937),
		new Point2D.Double(0.125610, 1.868359),
		new Point2D.Double(0.129858, 1.876904),
		new Point2D.Double(0.134058, 1.885352),
		new Point2D.Double(0.137817, 1.891016),
		new Point2D.Double(0.139771, 1.896899),
		new Point2D.Double(0.143652, 1.908618),
		new Point2D.Double(0.145410, 1.912158),
		new Point2D.Double(0.147363, 1.918042),
		new Point2D.Double(0.149121, 1.921606),
		new Point2D.Double(0.150854, 1.928711),
		new Point2D.Double(0.152441, 1.937183),
		new Point2D.Double(0.155322, 1.788477),
		new Point2D.Double(0.161670, 1.756714),
		new Point2D.Double(0.167603, 1.727002),
		new Point2D.Double(0.177637, 1.690137),
		new Point2D.Double(0.191406, 1.648779),
		new Point2D.Double(0.212524, 1.581152),
		new Point2D.Double(0.221069, 1.555493),
		new Point2D.Double(0.239575, 1.511084),
		new Point2D.Double(0.257690, 1.467578),
		new Point2D.Double(0.275659, 1.424414),
		new Point2D.Double(0.296899, 1.381934),
		new Point2D.Double(0.314526, 1.343140),
		new Point2D.Double(0.331274, 1.309619),
		new Point2D.Double(0.347339, 1.277466),
		new Point2D.Double(0.354761, 1.262598),
		new Point2D.Double(0.370630, 1.234009),
		new Point2D.Double(0.381934, 1.214209),
		new Point2D.Double(0.389893, 1.195630),
		new Point2D.Double(0.404224, 1.171533),
		new Point2D.Double(0.408472, 1.163013),
		new Point2D.Double(0.412378, 1.157153),
		new Point2D.Double(0.414160, 1.153589),
		new Point2D.Double(0.415771, 1.151978),
		new Point2D.Double(0.417383, 1.150366),
		new Point2D.Double(0.420410, 1.031763),
		new Point2D.Double(0.438281, 0.978101),
		new Point2D.Double(0.449585, 0.955469),
		new Point2D.Double(0.458154, 0.929761),
		new Point2D.Double(0.486206, 0.881738),
		new Point2D.Double(0.500342, 0.861938),
		new Point2D.Double(0.512695, 0.847095),
		new Point2D.Double(0.526831, 0.827295),
		new Point2D.Double(0.556812, 0.794653),
		new Point2D.Double(0.572949, 0.778516),
		new Point2D.Double(0.589917, 0.761548),
		new Point2D.Double(0.606689, 0.744775),
		new Point2D.Double(0.623608, 0.727856),
		new Point2D.Double(0.638843, 0.715161),
		new Point2D.Double(0.648071, 0.705933),
		new Point2D.Double(0.661304, 0.692700),
		new Point2D.Double(0.673706, 0.682788),
		new Point2D.Double(0.686108, 0.672876),
		new Point2D.Double(0.698413, 0.663037),
		new Point2D.Double(0.707324, 0.656348),
		new Point2D.Double(0.715845, 0.652100),
		new Point2D.Double(0.719409, 0.648535),
		new Point2D.Double(0.725269, 0.644629),
		new Point2D.Double(0.726880, 0.643018),
		new Point2D.Double(0.730444, 0.639453),
		new Point2D.Double(0.732056, 0.637842),
		new Point2D.Double(0.733667, 0.636230),
		new Point2D.Double(0.735278, 0.636230),
		new Point2D.Double(0.736938, 0.650562),
		new Point2D.Double(0.746143, 0.659790),
		new Point2D.Double(0.752515, 0.666187),
		new Point2D.Double(0.761377, 0.672852),
		new Point2D.Double(0.767773, 0.679272),
		new Point2D.Double(0.776270, 0.683545),
		new Point2D.Double(0.785400, 0.690405),
		new Point2D.Double(0.793628, 0.694531),
		new Point2D.Double(0.800024, 0.700952),
		new Point2D.Double(0.808496, 0.705200),
		new Point2D.Double(0.814673, 0.711401),
		new Point2D.Double(0.820532, 0.715332),
		new Point2D.Double(0.829761, 0.722266),
		new Point2D.Double(0.836646, 0.731470),
		new Point2D.Double(0.848950, 0.741333),
		new Point2D.Double(0.858398, 0.753149),
		new Point2D.Double(0.865308, 0.764697),
		new Point2D.Double(0.875903, 0.780615),
		new Point2D.Double(0.887207, 0.800415),
		new Point2D.Double(0.894727, 0.818018),
		new Point2D.Double(0.901636, 0.829565),
		new Point2D.Double(0.914331, 0.861328),
		new Point2D.Double(0.925513, 0.883716),
		new Point2D.Double(0.933618, 0.905347),
		new Point2D.Double(0.944922, 0.925171),
		new Point2D.Double(0.953711, 0.951562),
		new Point2D.Double(0.962720, 0.978613),
		new Point2D.Double(0.971143, 1.003906),
		new Point2D.Double(0.980151, 1.030957),
		new Point2D.Double(0.989429, 1.061914),
		new Point2D.Double(0.995776, 1.093701),
		new Point2D.Double(1.004541, 1.122998),
		new Point2D.Double(1.009155, 1.134546),
		new Point2D.Double(1.022949, 1.176001),
		new Point2D.Double(1.029297, 1.207788),
		new Point2D.Double(1.037524, 1.229785),
		new Point2D.Double(1.043408, 1.256348),
		new Point2D.Double(1.048022, 1.267896),
		new Point2D.Double(1.053223, 1.286182),
		new Point2D.Double(1.058179, 1.301074),
		new Point2D.Double(1.067505, 1.326782),
		new Point2D.Double(1.069604, 1.335205),
		new Point2D.Double(1.071729, 1.343750),
		new Point2D.Double(1.073608, 1.349438),
		new Point2D.Double(1.075391, 1.353027),
		new Point2D.Double(1.077173, 1.356616),
		new Point2D.Double(1.078784, 1.358252),
		new Point2D.Double(1.080566, 1.354956),
		new Point2D.Double(1.082178, 1.353345),
		new Point2D.Double(1.084058, 1.347681),
		new Point2D.Double(1.086011, 1.341821),
		new Point2D.Double(1.087915, 1.336060),
		new Point2D.Double(1.092163, 1.327539),
		new Point2D.Double(1.096826, 1.313550),
		new Point2D.Double(1.099292, 1.298682),
		new Point2D.Double(1.104590, 1.280103),
		new Point2D.Double(1.107275, 1.258545),
		new Point2D.Double(1.120972, 1.188721),
		new Point2D.Double(1.129736, 1.114136),
		new Point2D.Double(1.137451, 1.060107),
		new Point2D.Double(1.149243, 0.997168),
		new Point2D.Double(1.158765, 0.965405),
		new Point2D.Double(1.179102, 0.858618),
		new Point2D.Double(1.191772, 0.790991),
		new Point2D.Double(1.198462, 0.754126),
		new Point2D.Double(1.214648, 0.693359),
		new Point2D.Double(1.226270, 0.639087),
		new Point2D.Double(1.237891, 0.584814),
		new Point2D.Double(1.248462, 0.542505),
		new Point2D.Double(1.258496, 0.505640),
		new Point2D.Double(1.264844, 0.473877),
		new Point2D.Double(1.267310, 0.459033),
		new Point2D.Double(1.270117, 0.436401),
		new Point2D.Double(1.272754, 0.417822),
		new Point2D.Double(1.275000, 0.406494),
		new Point2D.Double(1.277295, 0.394971),
		new Point2D.Double(1.287280, 0.377808),
		new Point2D.Double(1.302051, 0.372900),
		new Point2D.Double(1.316455, 0.368115),
		new Point2D.Double(1.327979, 0.363501),
		new Point2D.Double(1.350610, 0.355029),
		new Point2D.Double(1.372900, 0.346680),
		new Point2D.Double(1.384180, 0.339917),
		new Point2D.Double(1.402759, 0.334619),
		new Point2D.Double(1.434521, 0.321924),
		new Point2D.Double(1.452832, 0.314087),
		new Point2D.Double(1.474707, 0.308618),
		new Point2D.Double(1.483228, 0.306494),
		new Point2D.Double(1.509863, 0.297632),
		new Point2D.Double(1.528442, 0.294995),
		new Point2D.Double(1.549512, 0.289746),
		new Point2D.Double(1.558032, 0.287622),
		new Point2D.Double(1.576489, 0.284985),
		new Point2D.Double(1.605347, 0.280200),
		new Point2D.Double(1.620215, 0.280200),
		new Point2D.Double(1.631543, 0.280200),
		new Point2D.Double(1.646411, 0.280200),
		new Point2D.Double(1.657422, 0.280200),
		new Point2D.Double(1.668945, 0.280200),
		new Point2D.Double(1.683716, 0.282666),
		new Point2D.Double(1.695483, 0.292090),
		new Point2D.Double(1.704712, 0.301343),
		new Point2D.Double(1.717969, 0.314624),
		new Point2D.Double(1.732031, 0.334326),
		new Point2D.Double(1.746143, 0.356958),
		new Point2D.Double(1.757446, 0.379614),
		new Point2D.Double(1.773315, 0.408228),
		new Point2D.Double(1.785327, 0.435278),
		new Point2D.Double(1.797974, 0.466919),
		new Point2D.Double(1.809937, 0.496851),
		new Point2D.Double(1.823340, 0.533740),
		new Point2D.Double(1.836743, 0.570630),
		new Point2D.Double(1.854175, 0.608984),
		new Point2D.Double(1.867456, 0.648877),
		new Point2D.Double(1.884204, 0.682422),
		new Point2D.Double(1.901831, 0.721240),
		new Point2D.Double(1.921777, 0.754517),
		new Point2D.Double(1.938525, 0.788062),
		new Point2D.Double(1.957227, 0.819263),
		new Point2D.Double(1.976294, 0.847876),
		new Point2D.Double(1.991602, 0.875488),
		new Point2D.Double(2.010669, 0.900928),
		new Point2D.Double(2.034888, 0.933276),
		new Point2D.Double(2.048071, 0.949146),
		new Point2D.Double(2.061157, 0.964868),
		new Point2D.Double(2.070728, 0.976880),
		new Point2D.Double(2.077637, 0.986133),
		new Point2D.Double(2.084521, 0.997656),
		new Point2D.Double(2.091406, 1.006860),
		new Point2D.Double(2.095215, 1.012598),
		new Point2D.Double(2.102124, 1.021851),
		new Point2D.Double(2.104248, 1.030396),
		new Point2D.Double(2.108154, 1.036279),
		new Point2D.Double(2.110449, 1.018921),
		new Point2D.Double(2.115747, 1.000342),
		new Point2D.Double(2.127002, 0.980640),
		new Point2D.Double(2.162256, 0.901318),
		new Point2D.Double(2.179883, 0.862524),
		new Point2D.Double(2.191797, 0.832715),
		new Point2D.Double(2.209424, 0.793921),
		new Point2D.Double(2.227051, 0.755127),
		new Point2D.Double(2.244897, 0.712280),
		new Point2D.Double(2.261914, 0.674854),
		new Point2D.Double(2.278662, 0.641333),
		new Point2D.Double(2.291138, 0.610107),
		new Point2D.Double(2.307690, 0.577002),
		new Point2D.Double(2.322876, 0.549658),
		new Point2D.Double(2.338354, 0.521484),
		new Point2D.Double(2.349658, 0.501685),
		new Point2D.Double(2.356274, 0.490649),
		new Point2D.Double(2.366187, 0.478247),
		new Point2D.Double(2.373022, 0.469141),
		new Point2D.Double(2.379419, 0.462744),
		new Point2D.Double(2.385937, 0.454053),
		new Point2D.Double(2.398193, 0.443750),
		new Point2D.Double(2.407422, 0.436841),
		new Point2D.Double(2.413818, 0.430444),
		new Point2D.Double(2.423047, 0.423535),
		new Point2D.Double(2.431567, 0.419287),
		new Point2D.Double(2.440796, 0.412378),
		new Point2D.Double(2.446655, 0.408472),
		new Point2D.Double(2.455884, 0.401562),
		new Point2D.Double(2.464404, 0.397314),
		new Point2D.Double(2.475928, 0.390405),
		new Point2D.Double(2.484448, 0.386157),
		new Point2D.Double(2.492969, 0.381909),
		new Point2D.Double(2.504492, 0.377295),
		new Point2D.Double(2.516016, 0.372681),
		new Point2D.Double(2.535693, 0.366089),
		new Point2D.Double(2.547217, 0.363794),
		new Point2D.Double(2.558740, 0.361499),
		new Point2D.Double(2.578784, 0.357080),
		new Point2D.Double(2.590308, 0.357080),
		new Point2D.Double(2.598828, 0.357080),
		new Point2D.Double(2.615771, 0.357080),
		new Point2D.Double(2.621631, 0.357080),
		new Point2D.Double(2.630103, 0.357080),
		new Point2D.Double(2.639526, 0.357080),
		new Point2D.Double(2.643091, 0.360669),
		new Point2D.Double(2.646606, 0.364209),
		new Point2D.Double(2.654395, 0.375952),
		new Point2D.Double(2.656348, 0.381836),
		new Point2D.Double(2.658276, 0.387671),
		new Point2D.Double(2.660059, 0.391260),
		new Point2D.Double(2.665771, 0.446338),
		new Point2D.Double(2.674292, 0.448486),
		new Point2D.Double(2.685815, 0.448486),
		new Point2D.Double(2.694336, 0.450635),
		new Point2D.Double(2.705859, 0.450635),
		new Point2D.Double(2.714380, 0.450635),
		new Point2D.Double(2.725903, 0.450635),
		new Point2D.Double(2.737427, 0.450635),
		new Point2D.Double(2.748950, 0.450635),
		new Point2D.Double(2.760474, 0.450635),
		new Point2D.Double(2.778394, 0.450635),
		new Point2D.Double(2.789722, 0.450635),
		new Point2D.Double(2.798242, 0.450635),
		new Point2D.Double(2.813110, 0.448169),
		new Point2D.Double(2.827979, 0.448169),
		new Point2D.Double(2.842847, 0.445703),
		new Point2D.Double(2.854370, 0.443408),
		new Point2D.Double(2.880762, 0.441113),
		new Point2D.Double(2.892285, 0.441113),
		new Point2D.Double(2.900684, 0.439014),
		new Point2D.Double(2.906543, 0.439014),
		new Point2D.Double(2.915063, 0.439014),
		new Point2D.Double(2.920923, 0.439014),
		new Point2D.Double(2.926758, 0.439014),
		new Point2D.Double(2.936182, 0.439014),
		new Point2D.Double(2.942041, 0.439014),
		new Point2D.Double(2.945605, 0.440820),
		new Point2D.Double(2.957324, 0.448682),
		new Point2D.Double(2.963184, 0.452612),
		new Point2D.Double(2.969580, 0.459033),
		new Point2D.Double(2.978809, 0.465967),
		new Point2D.Double(2.985718, 0.475220),
		new Point2D.Double(2.992017, 0.481543),
		new Point2D.Double(2.998926, 0.490796),
		new Point2D.Double(3.003174, 0.499341),
		new Point2D.Double(3.014331, 0.517139),
		new Point2D.Double(3.018237, 0.523022),
		new Point2D.Double(3.024634, 0.529443),
		new Point2D.Double(3.026587, 0.535327),
		new Point2D.Double(3.030493, 0.541211),
		new Point2D.Double(3.037964, 0.550684),
		new Point2D.Double(3.039746, 0.554272),
		new Point2D.Double(3.043311, 0.557861),
		new Point2D.Double(3.045093, 0.561450),
		new Point2D.Double(3.048657, 0.565039),
		new Point2D.Double(3.052222, 0.568628),
		new Point2D.Double(3.055786, 0.570435),
		new Point2D.Double(3.057397, 0.572070),
		new Point2D.Double(3.060962, 0.573877),
		new Point2D.Double(3.064526, 0.575684),
		new Point2D.Double(3.066138, 0.577319),
		new Point2D.Double(3.069702, 0.579126),
		new Point2D.Double(3.074878, 0.580933),
		new Point2D.Double(3.078076, 0.582544),
		new Point2D.Double(3.079687, 0.582544),
		new Point2D.Double(3.081299, 0.582544),
		new Point2D.Double(3.082788, 0.584058),
		new Point2D.Double(3.084253, 0.585547),
		new Point2D.Double(3.085864, 0.587183),
		new Point2D.Double(3.087476, 0.588818),
		new Point2D.Double(3.089087, 0.590454),
		new Point2D.Double(3.090698, 0.592090),
		new Point2D.Double(3.092480, 0.595679),
		new Point2D.Double(3.094092, 0.597314),
		new Point2D.Double(3.097656, 0.604492),
		new Point2D.Double(3.099438, 0.608081),
		new Point2D.Double(3.104614, 0.611523),
		new Point2D.Double(3.108154, 0.618652),
		new Point2D.Double(3.114551, 0.625073),
		new Point2D.Double(3.118115, 0.628662),
		new Point2D.Double(3.122021, 0.634546),
		new Point2D.Double(3.125928, 0.640430),
		new Point2D.Double(3.130176, 0.648975),
		new Point2D.Double(3.136963, 0.658057),
		new Point2D.Double(3.147778, 0.673193),
		new Point2D.Double(3.152026, 0.681738),
		new Point2D.Double(3.158423, 0.688159),
		new Point2D.Double(3.165332, 0.697412),
		new Point2D.Double(3.171191, 0.701343),
		new Point2D.Double(3.177588, 0.707764),
		new Point2D.Double(3.183398, 0.711646),
		new Point2D.Double(3.187305, 0.717529),
		new Point2D.Double(3.193140, 0.719482),
		new Point2D.Double(3.196704, 0.723071),
		new Point2D.Double(3.202563, 0.725049),
		new Point2D.Double(3.206128, 0.726855),
		new Point2D.Double(3.209692, 0.728662),
		new Point2D.Double(3.211304, 0.730298),
		new Point2D.Double(3.212915, 0.731934),
		new Point2D.Double(3.214502, 0.731934),
		new Point2D.Double(3.216113, 0.731934),
		new Point2D.Double(3.217700, 0.731934),
		new Point2D.Double(3.219312, 0.731934),
		new Point2D.Double(3.220825, 0.731934),
		new Point2D.Double(3.222339, 0.731934),
		new Point2D.Double(3.223853, 0.731934),
		new Point2D.Double(3.225464, 0.730322),
		new Point2D.Double(3.229712, 0.721802),
		new Point2D.Double(3.232007, 0.710278),
		new Point2D.Double(3.233960, 0.704419),
		new Point2D.Double(3.239233, 0.685889),
		new Point2D.Double(3.244531, 0.667310),
		new Point2D.Double(3.249438, 0.652563),
		new Point2D.Double(3.252075, 0.633984),
		new Point2D.Double(3.256274, 0.625586),
		new Point2D.Double(3.261230, 0.610718),
		new Point2D.Double(3.270239, 0.583691),
		new Point2D.Double(3.272363, 0.575171),
		new Point2D.Double(3.279785, 0.560303),
		new Point2D.Double(3.286694, 0.548779),
		new Point2D.Double(3.291650, 0.533911),
		new Point2D.Double(3.298560, 0.522388),
		new Point2D.Double(3.305981, 0.507520),
		new Point2D.Double(3.312891, 0.498291),
		new Point2D.Double(3.317505, 0.486768),
		new Point2D.Double(3.324414, 0.475244),
		new Point2D.Double(3.328662, 0.466724),
		new Point2D.Double(3.330762, 0.458276),
		new Point2D.Double(3.334668, 0.452417),
		new Point2D.Double(3.336792, 0.443896),
		new Point2D.Double(3.340527, 0.434473),
		new Point2D.Double(3.342480, 0.428613),
		new Point2D.Double(3.344702, 0.420239),
		new Point2D.Double(3.355591, 0.420239),
		new Point2D.Double(3.364111, 0.418115),
		new Point2D.Double(3.375635, 0.413501),
		new Point2D.Double(3.386475, 0.411353),
		new Point2D.Double(3.409497, 0.402148),
		new Point2D.Double(3.423413, 0.397510),
		new Point2D.Double(3.434937, 0.395215),
		new Point2D.Double(3.443457, 0.390967),
		new Point2D.Double(3.454541, 0.386548),
		new Point2D.Double(3.463062, 0.384424),
		new Point2D.Double(3.471533, 0.382324),
		new Point2D.Double(3.477393, 0.380371),
		new Point2D.Double(3.480884, 0.378638),
		new Point2D.Double(3.484448, 0.376855),
		new Point2D.Double(3.488013, 0.375073),
		new Point2D.Double(3.489624, 0.375073),
		new Point2D.Double(3.491211, 0.375073),
		new Point2D.Double(3.492822, 0.375073),
		new Point2D.Double(3.494409, 0.375073),
		new Point2D.Double(3.496021, 0.375073),
		new Point2D.Double(3.497534, 0.375073),
		new Point2D.Double(3.499146, 0.375073),
		new Point2D.Double(3.500732, 0.375073),
		new Point2D.Double(3.504297, 0.375073),
		new Point2D.Double(3.505884, 0.375073),
		new Point2D.Double(3.512988, 0.375073),
		new Point2D.Double(3.516553, 0.375073),
		new Point2D.Double(3.520020, 0.375073),
		new Point2D.Double(3.523584, 0.373291),
		new Point2D.Double(3.529419, 0.371362),
		new Point2D.Double(3.540991, 0.365552),
		new Point2D.Double(3.544556, 0.361987),
		new Point2D.Double(3.550391, 0.358105),
		new Point2D.Double(3.556519, 0.351978),
		new Point2D.Double(3.560083, 0.348413),
		new Point2D.Double(3.565942, 0.344507),
		new Point2D.Double(3.569482, 0.340967),
		new Point2D.Double(3.572974, 0.337476),
		new Point2D.Double(3.574585, 0.335864),
		new Point2D.Double(3.578149, 0.332300),
		new Point2D.Double(3.579932, 0.328735),
		new Point2D.Double(3.581519, 0.327148),
		new Point2D.Double(3.583301, 0.323584),
		new Point2D.Double(3.585034, 0.320093),
		new Point2D.Double(3.586816, 0.316528),
		new Point2D.Double(3.588550, 0.313037),
		new Point2D.Double(3.590332, 0.309473),
		new Point2D.Double(3.592090, 0.305933),
		new Point2D.Double(3.593872, 0.302368),
		new Point2D.Double(3.595605, 0.298877),
		new Point2D.Double(3.597217, 0.297266),
		new Point2D.Double(3.598950, 0.293774),
		new Point2D.Double(3.600537, 0.288623),
		new Point2D.Double(3.602148, 0.285400),
		new Point2D.Double(3.603760, 0.280591),
		new Point2D.Double(3.605371, 0.269629),
		new Point2D.Double(3.607300, 0.256836),
		new Point2D.Double(3.609082, 0.253271),
		new Point2D.Double(3.610864, 0.246265),
		new Point2D.Double(3.612817, 0.240405),
		new Point2D.Double(3.614600, 0.236841),
		new Point2D.Double(3.616553, 0.230981),
		new Point2D.Double(3.618506, 0.225122),
		new Point2D.Double(3.620288, 0.221558),
		new Point2D.Double(3.624194, 0.215698),
		new Point2D.Double(3.625977, 0.212134),
		new Point2D.Double(3.627759, 0.208569),
		new Point2D.Double(3.631665, 0.202710),
		new Point2D.Double(3.633276, 0.201099),
		new Point2D.Double(3.637183, 0.195239),
		new Point2D.Double(3.638794, 0.193628),
		new Point2D.Double(3.642358, 0.190063),
		new Point2D.Double(3.644141, 0.186499),
		new Point2D.Double(3.647705, 0.182935),
		new Point2D.Double(3.649316, 0.181323),
		new Point2D.Double(3.652881, 0.177759),
		new Point2D.Double(3.654492, 0.176147),
		new Point2D.Double(3.658057, 0.172583),
		new Point2D.Double(3.659668, 0.170972),
		new Point2D.Double(3.663232, 0.169189),
		new Point2D.Double(3.665015, 0.165625),
		new Point2D.Double(3.670190, 0.162231),
		new Point2D.Double(3.671802, 0.160620),
		new Point2D.Double(3.673413, 0.159009),
		new Point2D.Double(3.675024, 0.157397),
		new Point2D.Double(3.676636, 0.155786),
		new Point2D.Double(3.678247, 0.154175),
		new Point2D.Double(3.679688, 0.152734),
		new Point2D.Double(3.681299, 0.151123),
		new Point2D.Double(3.682910, 0.151123),
		new Point2D.Double(3.684497, 0.149536),
		new Point2D.Double(3.686108, 0.148022),
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
