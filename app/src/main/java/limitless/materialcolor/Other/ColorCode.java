package limitless.materialcolor.Other;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import limitless.materialcolor.Model.Color;

public class ColorCode {

    public static List<Color> getColorName(){
        List<Color> colors = new ArrayList<>();
        Color mc = new Color();
        mc.setName("Red");
        mc.setCode("#f44336");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        mc = new Color();
        mc.setName("");
        mc.setCode("");
        colors.add(mc);

        return colors;
    }

    public static String[][] colorMain = new String[][]{
            {"Red", "#f44336"},
            {"Pink", "#E91E63"},
            {"Purple", "#9C27B0"},
            {"Deep Purple", "#673AB7"},
            {"Indigo", "#3F51B5"},
            {"Blue", "#2196F3"},
            {"Light Blue", "#03A9F4"},
            {"Cyan", "#00BCD4"},
            {"Teal", "#009688"},
            {"Green", "#4CAF50"},
            {"Light Green", "#8BC34A"},
            {"Lime", "#CDDC39"},
            {"Yellow", "#FFEB3B"},
            {"Amber", "#FFC107"},
            {"Orange", "#FF9800"},
            {"Deep Orange", "#FF5722"},
            {"Brown", "#795548"},
            {"Gray", "#9E9E9E"},
            {"Blue Gray", "#607D8B"}
    };

    public static String[][] getC(int i){
        switch (i){
            case 0:
                return colorRed;
            case 1:
                return colorPink;
            case 2:
                return colorPurple;
            case 3:
                return colorDeepPurple;
            case 4:
                return colorIndigo;
            case 5:
                return colorBlue;
            case 6:
                return colorLightBlue;
            case 7:
                return colorCyan;
            case 8:
                return colorTeal;
            case 9:
                return colorGreen;
            case 10:
                return colorLightGreen;
            case 11:
                return colorLime;
            case 12:
                return colorYellow;
            case 13:
                return colorAmber;
            case 14:
                return colorOrange;
            case 15:
                return colorDeepOrange;
            case 16:
                return colorBrown;
            case 17:
                return colorGray;
            case 18:
                return colorBlueGray;
            default:
                return colorRed;
        }

    }

    public static String[][] colorRed = new String[][]{
            {"50", "#ffebee"},
            {"100", "#ffcdd2"},
            {"200", "#ef9a9a"},
            {"300", "#e57373"},
            {"400", "#ef5350"},
            {"500", "#f44336"},
            {"600", "#e53935"},
            {"700", "#d32f2f"},
            {"800", "#c62828"},
            {"900", "#b71c1c"},
            {"A100", "#ff8a80"},
            {"A200", "#ff5252"},
            {"A400", "#ff1744"},
            {"A700", "#d50000"}
    };

    public static String[][] colorPink = new String[][]{
            {"50", "#FCE4EC"},
            {"100", "#F8BBD0"},
            {"200", "#F48FB1"},
            {"300", "#F06292"},
            {"400", "#EC407A"},
            {"500", "#E91E63"},
            {"600", "#D81B60"},
            {"700", "#C2185B"},
            {"800", "#AD1457"},
            {"900", "#880E4F"},
            {"A100", "#FF80AB"},
            {"A200", "#FF4081"},
            {"A400", "#F50057"},
            {"A700", "#C51162"}
    };

    public static String[][] colorPurple = new String[][]{
            {"50", "#F3E5F5"},
            {"100", "#E1BEE7"},
            {"200", "#CE93D8"},
            {"300", "#BA68C8"},
            {"400", "#AB47BC"},
            {"500", "#9C27B0"},
            {"600", "#8E24AA"},
            {"700", "#7B1FA2"},
            {"800", "#6A1B9A"},
            {"900", "#4A148C"},
            {"A100", "#EA80FC"},
            {"A200", "#E040FB"},
            {"A400", "#D500F9"},
            {"A700", "#AA00FF"}
    };

    public static String[][] colorDeepPurple = new String[][]{
            {"50", "#EDE7F6"},
            {"100", "#D1C4E9"},
            {"200", "#B39DDB"},
            {"300", "#9575CD"},
            {"400", "#7E57C2"},
            {"500", "#673AB7"},
            {"600", "#5E35B1"},
            {"700", "#512DA8"},
            {"800", "#4527A0"},
            {"900", "#311B92"},
            {"A100", "#B388FF"},
            {"A200", "#7C4DFF"},
            {"A400", "#651FFF"},
            {"A700", "#6200EA"}
    };

    public static String[][] colorIndigo = new String[][]{
            {"50", "#E8EAF6"},
            {"100", "#C5CAE9"},
            {"200", "#9FA8DA"},
            {"300", "#7986CB"},
            {"400", "#5C6BC0"},
            {"500", "#3F51B5"},
            {"600", "#3949AB"},
            {"700", "#303F9F"},
            {"800", "#283593"},
            {"900", "#1A237E"},
            {"A100", "#8C9EFF"},
            {"A200", "#536DFE"},
            {"A400", "#3D5AFE"},
            {"A700", "#304FFE"}
    };

    public static String[][] colorBlue = new String[][]{
            {"50", "#E3F2FD"},
            {"100", "#BBDEFB"},
            {"200", "#90CAF9"},
            {"300", "#64B5F6"},
            {"400", "#42A5F5"},
            {"500", "#2196F3"},
            {"600", "#1E88E5"},
            {"700", "#1976D2"},
            {"800", "#1565C0"},
            {"900", "#0D47A1"},
            {"A100", "#82B1FF"},
            {"A200", "#448AFF"},
            {"A400", "#2979FF"},
            {"A700", "#2962FF"}
    };

    public static String[][] colorLightBlue = new String[][]{
            {"50", "#E1F5FE"},
            {"100", "#B3E5FC"},
            {"200", "#81D4FA"},
            {"300", "#4FC3F7"},
            {"400", "#29B6F6"},
            {"500", "#03A9F4"},
            {"600", "#039BE5"},
            {"700", "#0288D1"},
            {"800", "#0277BD"},
            {"900", "#01579B"},
            {"A100", "#80D8FF"},
            {"A200", "#40C4FF"},
            {"A400", "#00B0FF"},
            {"A700", "#0091EA"}
    };

    public static String[][] colorCyan = new String[][]{
            {"50", "#E0F7FA"},
            {"100", "#B2EBF2"},
            {"200", "#80DEEA"},
            {"300", "#4DD0E1"},
            {"400", "#26C6DA"},
            {"500", "#00BCD4"},
            {"600", "#00ACC1"},
            {"700", "#0097A7"},
            {"800", "#00838F"},
            {"900", "#006064"},
            {"A100", "#84FFFF"},
            {"A200", "#18FFFF"},
            {"A400", "#00E5FF"},
            {"A700", "#00B8D4"}
    };

    public static String[][] colorTeal = new String[][]{
            {"50", "#E0F2F1"},
            {"100", "#B2DFDB"},
            {"200", "#80CBC4"},
            {"300", "#4DB6AC"},
            {"400", "#26A69A"},
            {"500", "#009688"},
            {"600", "#00897B"},
            {"700", "#00796B"},
            {"800", "#00695C"},
            {"900", "#004D40"},
            {"A100", "#A7FFEB"},
            {"A200", "#64FFDA"},
            {"A400", "#1DE9B6"},
            {"A700", "#00BFA5"}
    };

    public static String[][] colorGreen = new String[][]{
            {"50", "#E8F5E9"},
            {"100", "#C8E6C9"},
            {"200", "#A5D6A7"},
            {"300", "#81C784"},
            {"400", "#66BB6A"},
            {"500", "#4CAF50"},
            {"600", "#43A047"},
            {"700", "#388E3C"},
            {"800", "#2E7D32"},
            {"900", "#1B5E20"},
            {"A100", "#B9F6CA"},
            {"A200", "#69F0AE"},
            {"A400", "#00E676"},
            {"A700", "#00C853"}
    };


    public static String[][] colorLightGreen = new String[][]{
            {"50", "#F1F8E9"},
            {"100", "#DCEDC8"},
            {"200", "#C5E1A5"},
            {"300", "#AED581"},
            {"400", "#9CCC65"},
            {"500", "#8BC34A"},
            {"600", "#7CB342"},
            {"700", "#689F38"},
            {"800", "#558B2F"},
            {"900", "#33691E"},
            {"A100", "#CCFF90"},
            {"A200", "#B2FF59"},
            {"A400", "#76FF03"},
            {"A700", "#64DD17"}
    };

    public static String[][] colorLime = new String[][]{
            {"50", "#F9FBE7"},
            {"100", "#F0F4C3"},
            {"200", "#E6EE9C"},
            {"300", "#DCE775"},
            {"400", "#D4E157"},
            {"500", "#CDDC39"},
            {"600", "#C0CA33"},
            {"700", "#AFB42B"},
            {"800", "#9E9D24"},
            {"900", "#827717"},
            {"A100", "#F4FF81"},
            {"A200", "#EEFF41"},
            {"A400", "#C6FF00"},
            {"A700", "#AEEA00"}
    };

    public static String[][] colorYellow = new String[][]{
            {"50", "#FFFDE7"},
            {"100", "#FFF9C4"},
            {"200", "#FFF59D"},
            {"300", "#FFF176"},
            {"400", "#FFEE58"},
            {"500", "#FFEB3B"},
            {"600", "#FDD835"},
            {"700", "#FBC02D"},
            {"800", "#F9A825"},
            {"900", "#F57F17"},
            {"A100", "#FFFF8D"},
            {"A200", "#FFFF00"},
            {"A400", "#FFEA00"},
            {"A700", "#FFD600"}
    };

    public static String[][] colorAmber = new String[][]{
            {"50", "#FFF8E1"},
            {"100", "#FFECB3"},
            {"200", "#FFE082"},
            {"300", "#FFD54F"},
            {"400", "#FFCA28"},
            {"500", "#FFC107"},
            {"600", "#FFB300"},
            {"700", "#FFA000"},
            {"800", "#FF8F00"},
            {"900", "#FF6F00"},
            {"A100", "#FFE57F"},
            {"A200", "#FFD740"},
            {"A400", "#FFC400"},
            {"A700", "#FFAB00"}
    };

    public static String[][] colorOrange = new String[][]{
            {"50", "#FFF3E0"},
            {"100", "#FFE0B2"},
            {"200", "#FFCC80"},
            {"300", "#FFB74D"},
            {"400", "#FFA726"},
            {"500", "#FF9800"},
            {"600", "#FB8C00"},
            {"700", "#F57C00"},
            {"800", "#EF6C00"},
            {"900", "#E65100"},
            {"A100", "#FFD180"},
            {"A200", "#FFAB40"},
            {"A400", "#FF9100"},
            {"A700", "#FF6D00"}
    };

    public static String[][] colorDeepOrange = new String[][]{
            {"50", "#FBE9E7"},
            {"100", "#FFCCBC"},
            {"200", "#FFAB91"},
            {"300", "#FF8A65"},
            {"400", "#FF7043"},
            {"500", "#FF5722"},
            {"600", "#F4511E"},
            {"700", "#E64A19"},
            {"800", "#D84315"},
            {"900", "#BF360C"},
            {"A100", "#FF9E80"},
            {"A200", "#FF6E40"},
            {"A400", "#FF3D00"},
            {"A700", "#DD2C00"}
    };

    public static String[][] colorBrown = new String[][]{
            {"50", "#EFEBE9"},
            {"100", "#D7CCC8"},
            {"200", "#BCAAA4"},
            {"300", "#A1887F"},
            {"400", "#8D6E63"},
            {"500", "#795548"},
            {"600", "#6D4C41"},
            {"700", "#5D4037"},
            {"800", "#4E342E"},
            {"900", "#3E2723"}
    };

    public static String[][] colorGray = new String[][]{
            {"50", "#FAFAFA"},
            {"100", "#F5F5F5"},
            {"200", "#EEEEEE"},
            {"300", "#E0E0E0"},
            {"400", "#BDBDBD"},
            {"500", "#9E9E9E"},
            {"600", "#757575"},
            {"700", "#616161"},
            {"800", "#424242"},
            {"900", "#212121"}
    };

    public static String[][] colorBlueGray = new String[][]{
            {"50", "#ECEFF1"},
            {"100", "#CFD8DC"},
            {"200", "#B0BEC5"},
            {"300", "#90A4AE"},
            {"400", "#78909C"},
            {"500", "#607D8B"},
            {"600", "#546E7A"},
            {"700", "#455A64"},
            {"800", "#37474F"},
            {"900", "#263238"}
    };

    public static String[][] colorTop = new String[][]{
            {"500", "#f44336"},
            {"500", "#E91E63"},
            {"500", "#9C27B0"},
            {"400", "#5C6BC0"},
            {"500", "#3F51B5"},
            {"300", "#64B5F6"},
            {"400", "#42A5F5"},
            {"500", "#2196F3"},
            {"500", "#03A9F4"},
            {"500", "#00BCD4"},
            {"500", "#009688"},
            {"300", "#81C784"},
            {"400", "#66BB6A"},
            {"500", "#4CAF50"},
            {"400", "#9CCC65"},
            {"500", "#8BC34A"},
            {"500", "#FFEB3B"},
            {"500", "#FFC107"},
            {"500", "#FF9800"},
            {"500", "#FF5722"},
            {"50", "#FAFAFA"},
            {"100", "#F5F5F5"},
            {"200", "#EEEEEE"},
            {"300", "#E0E0E0"},
            {"400", "#BDBDBD"},
            {"500", "#9E9E9E"},
            {"500", "#607D8B"},
            {"800", "#424242"},
            {"900", "#212121"},
            {"900", "#263238"}
    };

    public static String[][] colorFlatUI = new String[][]{
            {"Turquoise", "#a4c400"},
            {"Emerland", "#2ecc71"},
            {"Peterriver", "#3498db"},
            {"Amthyst", "#9b59b6"},
            {"Wetasphalt", "#34495e"},
            {"Greansea", "#16a085"},
            {"Nephritis", "#27ae60"},
            {"Belizehole", "#2980b9"},
            {"Wisteria", "#8e44ad"},
            {"Midnightblue", "#2c3e50"},
            {"Sunflower", "#f1c40f"},
            {"Carrot", "#e67e22"},
            {"Alizarin", "#e74c3c"},
            {"Clouds", "#ecf0f1"},
            {"Concrete", "#95a5a6"},
            {"Orange", "#f39c12"},
            {"Pumpkin", "#d35400"},
            {"Pomegranate", "#c0392b"},
            {"Silver", "#bdc3c7"},
            {"Asbestose", "#7f8c8d"}
    };

    public static String[][] colorFluent = new String[][]{
            {"", "#FFB900"},
            {"", "#FFB900"},
            {"", "#F7630C"},
            {"", "#CA5010"},
            {"", "#DA3B01"},
            {"", "#EF6950"},
            {"", "#D13438"},
            {"", "#FF4343"},
            {"", "#E74856"},
            {"", "#E81123"},
            {"", "#EA005E"},
            {"", "#C30052"},
            {"", "#E3008C"},
            {"", "#BF0077"},
            {"", "#C239B3"},
            {"", "#9A0089"},
            {"", "#0078D7"},
            {"", "#0063B1"},
            {"", "#8E8CD8"},
            {"", "#6B69D6"},
            {"", "#8764B8"},
            {"", "#744DA9"},
            {"", "#B146C2"},
            {"", "#881798"},
            {"", "#0099BC"},
            {"", "#2D7D9A"},
            {"", "#00B7C3"},
            {"", "#038387"},
            {"", "#00B294"},
            {"", "#018574"},
            {"", "#00CC6A"},
            {"", "#10893E"},
            {"", "#7A7574"},
            {"", "#5D5A58"},
            {"", "#68768A"},
            {"", "#515C6B"},
            {"", "#567C73"},
            {"", "#486860"},
            {"", "#498205"},
            {"", "#107C10"},
            {"", "#767676"},
            {"", "#4C4A48"},
            {"", "#69797E"},
            {"", "#4A5459"},
            {"", "#647C64"},
            {"", "#525E54"},
            {"", "#847545"},
            {"", "#7E735F"}
    };

    public static String[][] colorSocial = new String[][]{
            {"Facebook", "#3b5999"},
            {"Messenger", "#0084ff"},
            {"Twitter", "#55acee"},
            {"Linkein", "#0077B5"},
            {"Skype", "#00AFF0"},
            {"Dropbox", "#007ee5"},
            {"Wordpress", "#21759b"},
            {"Vimeo", "#1ab7ea"},
            {"SlideShare", "#0077b5"},
            {"VK", "#4c75a3"},
            {"Tumbler", "#34465d"},
            {"Yahoo", "#410093"},
            {"Google Plus", "#dd4b39"},
            {"Pinterest", "#bd081c"},
            {"Youtube", "#cd201f"},
            {"StumbleUpon", "#eb4924"},
            {"Reddit", "#ff5700"},
            {"Quora", "#b92b27"},
            {"Yelp", "#af0606"},
            {"Weibo", "#df2029"},
            {"ProductHunt", "#da552f"},
            {"HackersNews", "#ff6600"},
            {"Soundcloud", "#ff3300"},
            {"Blogger", "#f57d00"},
            {"WhatsApp", "#25D366"},
            {"WeChat", "#09b83e"},
            {"Line", "#00c300"},
            {"Medium", "#02b875"},
            {"Vine", "#00b489"},
            {"Slack", "#3aaf85"},
            {"Instagram", "#e4405f"},
            {"Dibbble", "#ea4c89"},
            {"Flicker", "#ff0084"},
            {"FourSquare", "#f94877"},
            {"Behance", "#131418"},
            {"Snapchat", "#FFFC00"}
    };

    public static String[][] colorMetro = new String[][]{
            {"Lime", "#a4c400"},
            {"Green", "#60a917"},
            {"Emerald", "#008a00"},
            {"Teal", "#00aba9"},
            {"Cyan", "#1ba1e2"},
            {"Cobalt", "#0050ef"},
            {"Indigo", "#6a00ff"},
            {"Violet", "#aa00ff"},
            {"Pink", "#f472d0"},
            {"Magenta", "#d80073"},
            {"Crimson", "#a20025"},
            {"Red", "#e51400"},
            {"Orange", "#fa6800"},
            {"Amber", "#f0a30a"},
            {"Yellow", "#e3c800"},
            {"Brown", "#825a2c"},
            {"Olive", "#6d8764"},
            {"Steel", "#647687"},
            {"Mauve", "#76608a"},
            {"Seinna", "#a0522d"}
    };

    public static JSONArray getGradientColor() throws JSONException {
        return new JSONArray("[\n" +
                "    {\n" +
                "        \"name\": \"Blu\",\n" +
                "        \"colors\": [\"#00416A\", \"#E4E5E6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ver\",\n" +
                "        \"colors\": [\"#FFE000\", \"#799F0C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ver Black\",\n" +
                "        \"colors\": [\"#F7F8F8\", \"#ACBB78\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Combi\",\n" +
                "        \"colors\": [\"#00416A\", \"#799F0C\", \"#FFE000\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Anwar\",\n" +
                "        \"colors\": [\"#334d50\", \"#cbcaa5\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bluelagoo\",\n" +
                "        \"colors\": [\"#0052D4\", \"#4364F7\", \"#6FB1FC\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lunada\",\n" +
                "        \"colors\": [\"#5433FF\", \"#20BDFF\", \"#A5FECB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Reaqua\",\n" +
                "        \"colors\": [\"#799F0C\", \"#ACBB78\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mango\",\n" +
                "        \"colors\": [\"#ffe259\", \"#ffa751\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bupe\",\n" +
                "        \"colors\": [\"#00416A\", \"#E4E5E6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Rea\",\n" +
                "        \"colors\": [\"#FFE000\", \"#799F0C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Windy\",\n" +
                "        \"colors\": [\"#acb6e5\", \"#86fde8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Royal Blue\",\n" +
                "        \"colors\": [\"#536976\", \"#292E49\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Royal Blue + Petrol\",\n" +
                "        \"colors\": [\"#BBD2C5\", \"#536976\", \"#292E49\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Copper\",\n" +
                "        \"colors\": [\"#B79891\", \"#94716B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Anamnisar\",\n" +
                "        \"colors\": [\"#9796f0\", \"#fbc7d4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Petrol\",\n" +
                "        \"colors\": [\"#BBD2C5\", \"#536976\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sky\",\n" +
                "        \"colors\": [\"#076585\", \"#ffffff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sel\",\n" +
                "        \"colors\": [\"#00467F\", \"#A5CC82\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Skyline\",\n" +
                "        \"colors\": [\"#1488CC\", \"#2B32B2\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"DIMIGO\",\n" +
                "        \"colors\": [\"#ec008c\", \"#fc6767\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purple Love\",\n" +
                "        \"colors\": [\"#cc2b5e\", \"#753a88\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sexy Blue\",\n" +
                "        \"colors\": [\"#2193b0\", \"#6dd5ed\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Blooker20\",\n" +
                "        \"colors\": [\"#e65c00\", \"#F9D423\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sea Blue\",\n" +
                "        \"colors\": [\"#2b5876\", \"#4e4376\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nimvelo\",\n" +
                "        \"colors\": [\"#314755\", \"#26a0da\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Hazel\",\n" +
                "        \"colors\": [\"#77A1D3\", \"#79CBCA\", \"#E684AE\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Noon to Dusk\",\n" +
                "        \"colors\": [\"#ff6e7f\", \"#bfe9ff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"YouTube\",\n" +
                "        \"colors\": [\"#e52d27\", \"#b31217\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cool Brown\",\n" +
                "        \"colors\": [\"#603813\", \"#b29f94\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Harmonic Energy\",\n" +
                "        \"colors\": [\"#16A085\", \"#F4D03F\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Playing with Reds\",\n" +
                "        \"colors\": [\"#D31027\", \"#EA384D\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sunny Days\",\n" +
                "        \"colors\": [\"#EDE574\", \"#E1F5C4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Green Beach\",\n" +
                "        \"colors\": [\"#02AAB0\", \"#00CDAC\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Intuitive Purple\",\n" +
                "        \"colors\": [\"#DA22FF\", \"#9733EE\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Emerald Water\",\n" +
                "        \"colors\": [\"#348F50\", \"#56B4D3\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lemon Twist\",\n" +
                "        \"colors\": [\"#3CA55C\", \"#B5AC49\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Monte Carlo\",\n" +
                "        \"colors\": [\"#CC95C0\", \"#DBD4B4\", \"#7AA1D2\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Horizon\",\n" +
                "        \"colors\": [\"#003973\", \"#E5E5BE\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Rose Water\",\n" +
                "        \"colors\": [\"#E55D87\", \"#5FC3E4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Frozen\",\n" +
                "        \"colors\": [\"#403B4A\", \"#E7E9BB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mango Pulp\",\n" +
                "        \"colors\": [\"#F09819\", \"#EDDE5D\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bloody Mary\",\n" +
                "        \"colors\": [\"#FF512F\", \"#DD2476\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Aubergine\",\n" +
                "        \"colors\": [\"#AA076B\", \"#61045F\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Aqua Marine\",\n" +
                "        \"colors\": [\"#1A2980\", \"#26D0CE\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sunrise\",\n" +
                "        \"colors\": [\"#FF512F\", \"#F09819\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purple Paradise\",\n" +
                "        \"colors\": [\"#1D2B64\", \"#F8CDDA\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Stripe\",\n" +
                "        \"colors\": [\"#1FA2FF\", \"#12D8FA\", \"#A6FFCB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sea Weed\",\n" +
                "        \"colors\": [\"#4CB8C4\", \"#3CD3AD\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pinky\",\n" +
                "        \"colors\": [\"#DD5E89\", \"#F7BB97\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cherry\",\n" +
                "        \"colors\": [\"#EB3349\", \"#F45C43\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mojito\",\n" +
                "        \"colors\": [\"#1D976C\", \"#93F9B9\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Juicy Orange\",\n" +
                "        \"colors\": [\"#FF8008\", \"#FFC837\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mirage\",\n" +
                "        \"colors\": [\"#16222A\", \"#3A6073\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Steel Gray\",\n" +
                "        \"colors\": [\"#1F1C2C\", \"#928DAB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kashmir\",\n" +
                "        \"colors\": [\"#614385\", \"#516395\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Electric Violet\",\n" +
                "        \"colors\": [\"#4776E6\", \"#8E54E9\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Venice Blue\",\n" +
                "        \"colors\": [\"#085078\", \"#85D8CE\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bora Bora\",\n" +
                "        \"colors\": [\"#2BC0E4\", \"#EAECC6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Moss\",\n" +
                "        \"colors\": [\"#134E5E\", \"#71B280\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Shroom Haze\",\n" +
                "        \"colors\": [\"#5C258D\", \"#4389A2\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mystic\",\n" +
                "        \"colors\": [\"#757F9A\", \"#D7DDE8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Midnight City\",\n" +
                "        \"colors\": [\"#232526\", \"#414345\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sea Blizz\",\n" +
                "        \"colors\": [\"#1CD8D2\", \"#93EDC7\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Opa\",\n" +
                "        \"colors\": [\"#3D7EAA\", \"#FFE47A\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Titanium\",\n" +
                "        \"colors\": [\"#283048\", \"#859398\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mantle\",\n" +
                "        \"colors\": [\"#24C6DC\", \"#514A9D\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dracula\",\n" +
                "        \"colors\": [\"#DC2424\", \"#4A569D\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Peach\",\n" +
                "        \"colors\": [\"#ED4264\", \"#FFEDBC\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Moonrise\",\n" +
                "        \"colors\": [\"#DAE2F8\", \"#D6A4A4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Clouds\",\n" +
                "        \"colors\": [\"#ECE9E6\", \"#FFFFFF\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Stellar\",\n" +
                "        \"colors\": [\"#7474BF\", \"#348AC7\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bourbon\",\n" +
                "        \"colors\": [\"#EC6F66\", \"#F3A183\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Calm Darya\",\n" +
                "        \"colors\": [\"#5f2c82\", \"#49a09d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Influenza\",\n" +
                "        \"colors\": [\"#C04848\", \"#480048\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Shrimpy\",\n" +
                "        \"colors\": [\"#e43a15\", \"#e65245\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Army\",\n" +
                "        \"colors\": [\"#414d0b\", \"#727a17\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Miaka\",\n" +
                "        \"colors\": [\"#FC354C\", \"#0ABFBC\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pinot Noir\",\n" +
                "        \"colors\": [\"#4b6cb7\", \"#182848\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Day Tripper\",\n" +
                "        \"colors\": [\"#f857a6\", \"#ff5858\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Namn\",\n" +
                "        \"colors\": [\"#a73737\", \"#7a2828\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Blurry Beach\",\n" +
                "        \"colors\": [\"#d53369\", \"#cbad6d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vasily\",\n" +
                "        \"colors\": [\"#e9d362\", \"#333333\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"A Lost Memory\",\n" +
                "        \"colors\": [\"#DE6262\", \"#FFB88C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Petrichor\",\n" +
                "        \"colors\": [\"#666600\", \"#999966\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jonquil\",\n" +
                "        \"colors\": [\"#FFEEEE\", \"#DDEFBB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sirius Tamed\",\n" +
                "        \"colors\": [\"#EFEFBB\", \"#D4D3DD\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kyoto\",\n" +
                "        \"colors\": [\"#c21500\", \"#ffc500\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Misty Meadow\",\n" +
                "        \"colors\": [\"#215f00\", \"#e4e4d9\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Aqualicious\",\n" +
                "        \"colors\": [\"#50C9C3\", \"#96DEDA\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Moor\",\n" +
                "        \"colors\": [\"#616161\", \"#9bc5c3\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Almost\",\n" +
                "        \"colors\": [\"#ddd6f3\", \"#faaca8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Forever Lost\",\n" +
                "        \"colors\": [\"#5D4157\", \"#A8CABA\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Winter\",\n" +
                "        \"colors\": [\"#E6DADA\", \"#274046\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nelson\",\n" +
                "        \"colors\": [\"#f2709c\", \"#ff9472\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Autumn\",\n" +
                "        \"colors\": [\"#DAD299\", \"#B0DAB9\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Candy\",\n" +
                "        \"colors\": [\"#D3959B\", \"#BFE6BA\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Reef\",\n" +
                "        \"colors\": [\"#00d2ff\", \"#3a7bd5\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"The Strain\",\n" +
                "        \"colors\": [\"#870000\", \"#190A05\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dirty Fog\",\n" +
                "        \"colors\": [\"#B993D6\", \"#8CA6DB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Earthly\",\n" +
                "        \"colors\": [\"#649173\", \"#DBD5A4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Virgin\",\n" +
                "        \"colors\": [\"#C9FFBF\", \"#FFAFBD\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ash\",\n" +
                "        \"colors\": [\"#606c88\", \"#3f4c6b\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cherryblossoms\",\n" +
                "        \"colors\": [\"#FBD3E9\", \"#BB377D\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Parklife\",\n" +
                "        \"colors\": [\"#ADD100\", \"#7B920A\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dance To Forget\",\n" +
                "        \"colors\": [\"#FF4E50\", \"#F9D423\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Starfall\",\n" +
                "        \"colors\": [\"#F0C27B\", \"#4B1248\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Red Mist\",\n" +
                "        \"colors\": [\"#000000\", \"#e74c3c\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Teal Love\",\n" +
                "        \"colors\": [\"#AAFFA9\", \"#11FFBD\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Neon Life\",\n" +
                "        \"colors\": [\"#B3FFAB\", \"#12FFF7\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Man of Steel\",\n" +
                "        \"colors\": [\"#780206\", \"#061161\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Amethyst\",\n" +
                "        \"colors\": [\"#9D50BB\", \"#6E48AA\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cheer Up Emo Kid\",\n" +
                "        \"colors\": [\"#556270\", \"#FF6B6B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Shore\",\n" +
                "        \"colors\": [\"#70e1f5\", \"#ffd194\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Facebook Messenger\",\n" +
                "        \"colors\": [\"#00c6ff\", \"#0072ff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"SoundCloud\",\n" +
                "        \"colors\": [\"#fe8c00\", \"#f83600\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Behongo\",\n" +
                "        \"colors\": [\"#52c234\", \"#061700\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"ServQuick\",\n" +
                "        \"colors\": [\"#485563\", \"#29323c\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Friday\",\n" +
                "        \"colors\": [\"#83a4d4\", \"#b6fbff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Martini\",\n" +
                "        \"colors\": [\"#FDFC47\", \"#24FE41\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Metallic Toad\",\n" +
                "        \"colors\": [\"#abbaab\", \"#ffffff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Between The Clouds\",\n" +
                "        \"colors\": [\"#73C8A9\", \"#373B44\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Crazy Orange I\",\n" +
                "        \"colors\": [\"#D38312\", \"#A83279\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Hersheys\",\n" +
                "        \"colors\": [\"#1e130c\", \"#9a8478\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Talking To Mice Elf\",\n" +
                "        \"colors\": [\"#948E99\", \"#2E1437\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purple Bliss\",\n" +
                "        \"colors\": [\"#360033\", \"#0b8793\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Predawn\",\n" +
                "        \"colors\": [\"#FFA17F\", \"#00223E\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Endless River\",\n" +
                "        \"colors\": [\"#43cea2\", \"#185a9d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pastel Orange at the Sun\",\n" +
                "        \"colors\": [\"#ffb347\", \"#ffcc33\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Twitch\",\n" +
                "        \"colors\": [\"#6441A5\", \"#2a0845\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Atlas\",\n" +
                "        \"colors\": [\"#FEAC5E\", \"#C779D0\", \"#4BC0C8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Instagram\",\n" +
                "        \"colors\": [\"#833ab4\", \"#fd1d1d\", \"#fcb045\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Flickr\",\n" +
                "        \"colors\": [\"#ff0084\", \"#33001b\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vine\",\n" +
                "        \"colors\": [\"#00bf8f\", \"#001510\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Turquoise flow\",\n" +
                "        \"colors\": [\"#136a8a\", \"#267871\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Portrait\",\n" +
                "        \"colors\": [\"#8e9eab\", \"#eef2f3\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Virgin America\",\n" +
                "        \"colors\": [\"#7b4397\", \"#dc2430\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Koko Caramel\",\n" +
                "        \"colors\": [\"#D1913C\", \"#FFD194\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Fresh Turboscent\",\n" +
                "        \"colors\": [\"#F1F2B5\", \"#135058\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Green to dark\",\n" +
                "        \"colors\": [\"#6A9113\", \"#141517\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ukraine\",\n" +
                "        \"colors\": [\"#004FF9\", \"#FFF94C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Curiosity blue\",\n" +
                "        \"colors\": [\"#525252\", \"#3d72b4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dark Knight\",\n" +
                "        \"colors\": [\"#BA8B02\", \"#181818\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Piglet\",\n" +
                "        \"colors\": [\"#ee9ca7\", \"#ffdde1\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lizard\",\n" +
                "        \"colors\": [\"#304352\", \"#d7d2cc\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sage Persuasion\",\n" +
                "        \"colors\": [\"#CCCCB2\", \"#757519\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Between Night and Day\",\n" +
                "        \"colors\": [\"#2c3e50\", \"#3498db\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Timber\",\n" +
                "        \"colors\": [\"#fc00ff\", \"#00dbde\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Passion\",\n" +
                "        \"colors\": [\"#e53935\", \"#e35d5b\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Clear Sky\",\n" +
                "        \"colors\": [\"#005C97\", \"#363795\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Master Card\",\n" +
                "        \"colors\": [\"#f46b45\", \"#eea849\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Back To Earth\",\n" +
                "        \"colors\": [\"#00C9FF\", \"#92FE9D\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Deep Purple\",\n" +
                "        \"colors\": [\"#673AB7\", \"#512DA8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Little Leaf\",\n" +
                "        \"colors\": [\"#76b852\", \"#8DC26F\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Netflix\",\n" +
                "        \"colors\": [\"#8E0E00\", \"#1F1C18\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Light Orange\",\n" +
                "        \"colors\": [\"#FFB75E\", \"#ED8F03\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Green and Blue\",\n" +
                "        \"colors\": [\"#c2e59c\", \"#64b3f4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Poncho\",\n" +
                "        \"colors\": [\"#403A3E\", \"#BE5869\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Back to the Future\",\n" +
                "        \"colors\": [\"#C02425\", \"#F0CB35\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Blush\",\n" +
                "        \"colors\": [\"#B24592\", \"#F15F79\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Inbox\",\n" +
                "        \"colors\": [\"#457fca\", \"#5691c8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purplin\",\n" +
                "        \"colors\": [\"#6a3093\", \"#a044ff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pale Wood\",\n" +
                "        \"colors\": [\"#eacda3\", \"#d6ae7b\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Haikus\",\n" +
                "        \"colors\": [\"#fd746c\", \"#ff9068\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pizelex\",\n" +
                "        \"colors\": [\"#114357\", \"#F29492\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Joomla\",\n" +
                "        \"colors\": [\"#1e3c72\", \"#2a5298\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Christmas\",\n" +
                "        \"colors\": [\"#2F7336\", \"#AA3A38\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Minnesota Vikings\",\n" +
                "        \"colors\": [\"#5614B0\", \"#DBD65C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Miami Dolphins\",\n" +
                "        \"colors\": [\"#4DA0B0\", \"#D39D38\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Forest\",\n" +
                "        \"colors\": [\"#5A3F37\", \"#2C7744\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nighthawk\",\n" +
                "        \"colors\": [\"#2980b9\", \"#2c3e50\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Superman\",\n" +
                "        \"colors\": [\"#0099F7\", \"#F11712\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Suzy\",\n" +
                "        \"colors\": [\"#834d9b\", \"#d04ed6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dark Skies\",\n" +
                "        \"colors\": [\"#4B79A1\", \"#283E51\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Deep Space\",\n" +
                "        \"colors\": [\"#000000\", \"#434343\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Decent\",\n" +
                "        \"colors\": [\"#4CA1AF\", \"#C4E0E5\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Colors Of Sky\",\n" +
                "        \"colors\": [\"#E0EAFC\", \"#CFDEF3\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purple White\",\n" +
                "        \"colors\": [\"#BA5370\", \"#F4E2D8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ali\",\n" +
                "        \"colors\": [\"#ff4b1f\", \"#1fddff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Alihossein\",\n" +
                "        \"colors\": [\"#f7ff00\", \"#db36a4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Shahabi\",\n" +
                "        \"colors\": [\"#a80077\", \"#66ff00\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Red Ocean\",\n" +
                "        \"colors\": [\"#1D4350\", \"#A43931\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Tranquil\",\n" +
                "        \"colors\": [\"#EECDA3\", \"#EF629F\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Transfile\",\n" +
                "        \"colors\": [\"#16BFFD\", \"#CB3066\"]\n" +
                "    },\n" +
                "\n" +
                "    {\n" +
                "        \"name\": \"Sylvia\",\n" +
                "        \"colors\": [\"#ff4b1f\", \"#ff9068\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sweet Morning\",\n" +
                "        \"colors\": [\"#FF5F6D\", \"#FFC371\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Politics\",\n" +
                "        \"colors\": [\"#2196f3\", \"#f44336\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bright Vault\",\n" +
                "        \"colors\": [\"#00d2ff\", \"#928DAB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Solid Vault\",\n" +
                "        \"colors\": [\"#3a7bd5\", \"#3a6073\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sunset\",\n" +
                "        \"colors\": [\"#0B486B\", \"#F56217\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Grapefruit Sunset\",\n" +
                "        \"colors\": [\"#e96443\", \"#904e95\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Deep Sea Space\",\n" +
                "        \"colors\": [\"#2C3E50\", \"#4CA1AF\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dusk\",\n" +
                "        \"colors\": [\"#2C3E50\", \"#FD746C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Minimal Red\",\n" +
                "        \"colors\": [\"#F00000\", \"#DC281E\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Royal\",\n" +
                "        \"colors\": [\"#141E30\", \"#243B55\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mauve\",\n" +
                "        \"colors\": [\"#42275a\", \"#734b6d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Frost\",\n" +
                "        \"colors\": [\"#000428\", \"#004e92\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lush\",\n" +
                "        \"colors\": [\"#56ab2f\", \"#a8e063\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Firewatch\",\n" +
                "        \"colors\": [\"#cb2d3e\", \"#ef473a\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sherbert\",\n" +
                "        \"colors\": [\"#f79d00\", \"#64f38c\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Blood Red\",\n" +
                "        \"colors\": [\"#f85032\", \"#e73827\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sun on the Horizon\",\n" +
                "        \"colors\": [\"#fceabb\", \"#f8b500\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"IIIT Delhi\",\n" +
                "        \"colors\": [\"#808080\", \"#3fada8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jupiter\",\n" +
                "        \"colors\": [\"#ffd89b\", \"#19547b\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"50 Shades of Grey\",\n" +
                "        \"colors\": [\"#bdc3c7\", \"#2c3e50\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dania\",\n" +
                "        \"colors\": [\"#BE93C5\", \"#7BC6CC\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Limeade\",\n" +
                "        \"colors\": [\"#A1FFCE\", \"#FAFFD1\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Disco\",\n" +
                "        \"colors\": [\"#4ECDC4\", \"#556270\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Love Couple\",\n" +
                "        \"colors\": [\"#3a6186\", \"#89253e\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Azure Pop\",\n" +
                "        \"colors\": [\"#ef32d9\", \"#89fffd\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Nepal\",\n" +
                "        \"colors\": [\"#de6161\", \"#2657eb\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cosmic Fusion\",\n" +
                "        \"colors\": [\"#ff00cc\", \"#333399\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Snapchat\",\n" +
                "        \"colors\": [\"#fffc00\", \"#ffffff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ed's Sunset Gradient\",\n" +
                "        \"colors\": [\"#ff7e5f\", \"#feb47b\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Brady Brady Fun Fun\",\n" +
                "        \"colors\": [\"#00c3ff\", \"#ffff1c\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Black Rosé\",\n" +
                "        \"colors\": [\"#f4c4f3\", \"#fc67fa\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"80's Purple\",\n" +
                "        \"colors\": [\"#41295a\", \"#2F0743\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Radar\",\n" +
                "        \"colors\": [\"#A770EF\", \"#CF8BF3\", \"#FDB99B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ibiza Sunset\",\n" +
                "        \"colors\": [\"#ee0979\", \"#ff6a00\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dawn\",\n" +
                "        \"colors\": [\"#F3904F\", \"#3B4371\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mild\",\n" +
                "        \"colors\": [\"#67B26F\", \"#4ca2cd\"]\n" +
                "    },\n" +
                "    {\n" +
                "\n" +
                "        \"name\": \"Vice City\",\n" +
                "        \"colors\": [\"#3494E6\", \"#EC6EAD\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jaipur\",\n" +
                "        \"colors\": [\"#DBE6F6\", \"#C5796D\"]\n" +
                "\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Jodhpur\",\n" +
                "        \"colors\": [\"#9CECFB\", \"#65C7F7\", \"#0052D4\"]\n" +
                "\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cocoaa Ice\",\n" +
                "        \"colors\": [\"#c0c0aa\", \"#1cefff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"EasyMed\",\n" +
                "        \"colors\": [\"#DCE35B\", \"#45B649\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Rose Colored Lenses\",\n" +
                "        \"colors\": [\"#E8CBC0\", \"#636FA4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"What lies Beyond\",\n" +
                "        \"colors\": [\"#F0F2F0\", \"#000C40\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Roseanna\",\n" +
                "        \"colors\": [\"#FFAFBD\", \"#ffc3a0\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Honey Dew\",\n" +
                "        \"colors\": [\"#43C6AC\", \"#F8FFAE\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Under the Lake\",\n" +
                "        \"colors\": [\"#093028\", \"#237A57\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"The Blue Lagoon\",\n" +
                "        \"colors\": [\"#43C6AC\", \"#191654\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Can You Feel The Love Tonight\",\n" +
                "        \"colors\": [\"#4568DC\", \"#B06AB3\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Very Blue\",\n" +
                "        \"colors\": [\"#0575E6\", \"#021B79\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Love and Liberty\",\n" +
                "        \"colors\": [\"#200122\", \"#6f0000\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Orca\",\n" +
                "        \"colors\": [\"#44A08D\", \"#093637\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Venice\",\n" +
                "        \"colors\": [\"#6190E8\", \"#A7BFE8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pacific Dream\",\n" +
                "        \"colors\": [\"#34e89e\", \"#0f3443\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Learning and Leading\",\n" +
                "        \"colors\": [\"#F7971E\", \"#FFD200\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Celestial\",\n" +
                "        \"colors\": [\"#C33764\", \"#1D2671\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purplepine\",\n" +
                "        \"colors\": [\"#20002c\", \"#cbb4d4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sha la la\",\n" +
                "        \"colors\": [\"#D66D75\", \"#E29587\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mini\",\n" +
                "        \"colors\": [\"#30E8BF\", \"#FF8235\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Maldives\",\n" +
                "        \"colors\": [\"#B2FEFA\", \"#0ED2F7\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cinnamint\",\n" +
                "        \"colors\": [\"#4AC29A\", \"#BDFFF3\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Html\",\n" +
                "        \"colors\": [\"#E44D26\", \"#F16529\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Coal\",\n" +
                "        \"colors\": [\"#EB5757\", \"#000000\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sunkist\",\n" +
                "        \"colors\": [\"#F2994A\", \"#F2C94C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Blue Skies\",\n" +
                "        \"colors\": [\"#56CCF2\", \"#2F80ED\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Chitty Chitty Bang Bang\",\n" +
                "        \"colors\": [\"#007991\", \"#78ffd6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Visions of Grandeur\",\n" +
                "        \"colors\": [\"#000046\", \"#1CB5E0\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Crystal Clear\",\n" +
                "        \"colors\": [\"#159957\", \"#155799\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Mello\",\n" +
                "        \"colors\": [\"#c0392b\", \"#8e44ad\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Compare Now\",\n" +
                "        \"colors\": [\"#EF3B36\", \"#FFFFFF\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Meridian\",\n" +
                "        \"colors\": [\"#283c86\", \"#45a247\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Relay\",\n" +
                "        \"colors\": [\"#3A1C71\", \"#D76D77\", \"#FFAF7B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Alive\",\n" +
                "        \"colors\": [\"#CB356B\", \"#BD3F32\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Scooter\",\n" +
                "        \"colors\": [\"#36D1DC\", \"#5B86E5\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Terminal\",\n" +
                "        \"colors\": [\"#000000\", \"#0f9b0f\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Telegram\",\n" +
                "        \"colors\": [\"#1c92d2\", \"#f2fcfe\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Crimson Tide\",\n" +
                "        \"colors\": [\"#642B73\", \"#C6426E\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Socialive\",\n" +
                "        \"colors\": [\"#06beb6\", \"#48b1bf\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Subu\",\n" +
                "        \"colors\": [\"#0cebeb\", \"#20e3b2\", \"#29ffc6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Broken Hearts\",\n" +
                "        \"colors\": [\"#d9a7c7\", \"#fffcdc\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kimoby Is The New Blue\",\n" +
                "        \"colors\": [\"#396afc\", \"#2948ff\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dull\",\n" +
                "        \"colors\": [\"#C9D6FF\", \"#E2E2E2\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Purpink\",\n" +
                "        \"colors\": [\"#7F00FF\", \"#E100FF\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Orange Coral\",\n" +
                "        \"colors\": [\"#ff9966\", \"#ff5e62\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Summer\",\n" +
                "        \"colors\": [\"#22c1c3\", \"#fdbb2d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"King Yna\",\n" +
                "        \"colors\": [\"#1a2a6c\", \"#b21f1f\", \"#fdbb2d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Velvet Sun\",\n" +
                "        \"colors\": [\"#e1eec3\", \"#f05053\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Zinc\",\n" +
                "        \"colors\": [\"#ADA996\", \"#F2F2F2\", \"#DBDBDB\", \"#EAEAEA\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Hydrogen\",\n" +
                "        \"colors\": [\"#667db6\", \"#0082c8\", \"#0082c8\", \"#667db6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Argon\",\n" +
                "        \"colors\": [\"#03001e\", \"#7303c0\", \"#ec38bc\", \"#fdeff9\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lithium\",\n" +
                "        \"colors\": [\"#6D6027\", \"#D3CBB8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Digital Water\",\n" +
                "        \"colors\": [\"#74ebd5\",\"#ACB6E5\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Orange Fun\",\n" +
                "        \"colors\": [\"#fc4a1a\", \"#f7b733\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Rainbow Blue\",\n" +
                "        \"colors\": [\"#00F260\", \"#0575E6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pink Flavour\",\n" +
                "        \"colors\": [\"#800080\", \"#ffc0cb\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sulphur\",\n" +
                "        \"colors\": [\"#CAC531\", \"#F3F9A7\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Selenium\",\n" +
                "        \"colors\": [\"#3C3B3F\", \"#605C3C\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Delicate\",\n" +
                "        \"colors\": [\"#D3CCE3\", \"#E9E4F0\"]\n" +
                "    },\n" +
                "    {\n" +
                "\n" +
                "        \"name\": \"Ohhappiness\",\n" +
                "        \"colors\": [\"#00b09b\", \"#96c93d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Lawrencium\",\n" +
                "        \"colors\": [\"#0f0c29\", \"#302b63\", \"#24243e\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Relaxing red\",\n" +
                "        \"colors\": [\"#fffbd5\", \"#b20a2c\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Taran Tado\",\n" +
                "        \"colors\": [\"#23074d\", \"#cc5333\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Bighead\",\n" +
                "        \"colors\": [\"#c94b4b\", \"#4b134f\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sublime Vivid\",\n" +
                "        \"colors\": [\"#FC466B\", \"#3F5EFB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sublime Light\",\n" +
                "        \"colors\": [\"#FC5C7D\", \"#6A82FB\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pun Yeta\",\n" +
                "        \"colors\": [\"#108dc7\", \"#ef8e38\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Quepal\",\n" +
                "        \"colors\": [\"#11998e\", \"#38ef7d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sand to Blue\",\n" +
                "        \"colors\": [\"#3E5151\", \"#DECBA4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Wedding Day Blues\",\n" +
                "        \"colors\": [\"#40E0D0\", \"#FF8C00\", \"#FF0080\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Shifter\",\n" +
                "        \"colors\": [\"#bc4e9c\", \"#f80759\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Red Sunset\",\n" +
                "        \"colors\": [\"#355C7D\", \"#6C5B7B\", \"#C06C84\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Moon Purple\",\n" +
                "        \"colors\": [\"#4e54c8\", \"#8f94fb\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Pure Lust\",\n" +
                "        \"colors\": [\"#333333\", \"#dd1818\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Slight Ocean View\",\n" +
                "        \"colors\": [\"#a8c0ff\", \"#3f2b96\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"eXpresso\",\n" +
                "        \"colors\": [\"#ad5389\", \"#3c1053\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Shifty\",\n" +
                "        \"colors\": [\"#636363\", \"#a2ab58\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Vanusa\",\n" +
                "        \"colors\": [\"#DA4453\", \"#89216B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Evening Night\",\n" +
                "        \"colors\": [\"#005AA7\", \"#FFFDE4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Magic\",\n" +
                "        \"colors\": [\"#59C173\", \"#a17fe0\", \"#5D26C1\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Margo\",\n" +
                "        \"colors\": [\"#FFEFBA\", \"#FFFFFF\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Blue Raspberry\",\n" +
                "        \"colors\": [\"#00B4DB\", \"#0083B0\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Citrus Peel\",\n" +
                "        \"colors\": [\"#FDC830\", \"#F37335\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Sin City Red\",\n" +
                "        \"colors\": [\"#ED213A\", \"#93291E\"]\n" +
                "    },    \n" +
                "    {\n" +
                "        \"name\": \"Rastafari\",\n" +
                "        \"colors\": [\"#1E9600\", \"#FFF200\", \"#FF0000\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Summer Dog\",\n" +
                "        \"colors\": [\"#a8ff78\", \"#78ffd6\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Wiretap\",\n" +
                "        \"colors\": [\"#8A2387\", \"#E94057\", \"#F27121\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Burning Orange\",\n" +
                "        \"colors\": [\"#FF416C\", \"#FF4B2B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Ultra Voilet\",\n" +
                "        \"colors\": [\"#654ea3\", \"#eaafc8\"]\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"By Design\",\n" +
                "      \"colors\": [\"#009FFF\", \"#ec2F4B\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kyoo Tah\",\n" +
                "        \"colors\": [\"#544a7d\", \"#ffd452\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kye Meh\",\n" +
                "        \"colors\": [\"#8360c3\", \"#2ebf91\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Kyoo Pal\",\n" +
                "        \"colors\": [\"#dd3e54\", \"#6be585\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Metapolis\",\n" +
                "        \"colors\": [\"#659999\", \"#f4791f\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Flare\",\n" +
                "        \"colors\": [\"#f12711\", \"#f5af19\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Witching Hour\",\n" +
                "        \"colors\": [\"#c31432\", \"#240b36\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Azur Lane\",\n" +
                "        \"colors\": [\"#7F7FD5\", \"#86A8E7\", \"#91EAE4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Neuromancer\",\n" +
                "        \"colors\": [\"#f953c6\", \"#b91d73\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Harvey\",\n" +
                "        \"colors\": [\"#1f4037\", \"#99f2c8\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Amin\",\n" +
                "        \"colors\": [\"#8E2DE2\", \"#4A00E0\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Memariani\",\n" +
                "        \"colors\": [\"#aa4b6b\", \"#6b6b83\" , \"#3b8d99\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Yoda\",\n" +
                "        \"colors\": [\"#FF0099\", \"#493240\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cool Sky\",\n" +
                "        \"colors\": [\"#2980B9\", \"#6DD5FA\", \"#FFFFFF\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Dark Ocean\",\n" +
                "        \"colors\": [\"#373B44\", \"#4286f4\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Evening Sunshine\",\n" +
                "        \"colors\": [\"#b92b27\", \"#1565C0\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"JShine\",\n" +
                "        \"colors\": [\"#12c2e9\",\"#c471ed\",\"#f64f59\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Moonlit Asteroid\",\n" +
                "        \"colors\": [\"#0F2027\", \"#203A43\", \"#2C5364\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"MegaTron\",\n" +
                "        \"colors\": [\"#C6FFDD\", \"#FBD786\", \"#f7797d\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Cool Blues\",\n" +
                "        \"colors\": [\"#2193b0\",\"#6dd5ed\"]\n" +
                "    },\n" +
                "    { \n" +
                "        \"name\": \"Piggy Pink\",\n" +
                "        \"colors\": [\"#ee9ca7\",\"#ffdde1\"]\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Grade Grey\",\n" +
                "        \"colors\": [\"#bdc3c7\",\"#2c3e50\"]\n" +
                "    }\n" +
                "]");
    }


}
