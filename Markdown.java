//public class Markdown_Strings {
//    public static void main (String[] args){
//
//
//
//        String header = "<html>\n<body>\n";
//        String footer = "</body>\n</html>\n";
//        String outputText = "";
//        String line;
//        String markdown = args[0];
//        int index;
//        if(markdown.contains("# ")){
//            index = markdown.lastIndexOf("#");
//            line =markdown.substring(index +1);
//            outputText += "<h1>" + line + "</h1>";
//        }
//        else if (markdown.contains("## ")){
//            index = markdown.lastIndexOf("##");
//            line = markdown.substring(index +1);
//            outputText += "<h2>" + line + "</h2>";
//        }
//        else if (markdown.startsWith("### ")){
//            index = markdown.lastIndexOf("###");
//            line = markdown.substring(index +1);
//            outputText += "<h3>" + line + "</h3>";
//        }
//        else if (markdown.startsWith("#### ")){
//            index = markdown.lastIndexOf("####");
//            line = markdown.substring(index + 1);
//            outputText += "<h4>" + line + "</h4>";
//        }
//        else if (markdown.startsWith("##### ")){
//            index = markdown.lastIndexOf("#####");
//            line = markdown.substring(index +1);
//            outputText += "<h5>" + line + "</h5>";
//        }
//        else if (markdown.startsWith("###### ")){
//            index = markdown.lastIndexOf("#####");
//            line = markdown.substring(index +1);
//            outputText += "<h6>" + line + "</h6>";
//        } else outputText = markdown;
//
//
//        return outputText;
//    }
//}
//
