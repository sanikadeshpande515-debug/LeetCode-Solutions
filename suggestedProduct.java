class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result=new ArrayList<>();
        for(int i=1;i<=searchWord.length();i++){
            String prefix= searchWord.substring(0,i);
            List<String> suggestions=new ArrayList<>();
            for(String product:products){
                if(product.startsWith(prefix)){
                    suggestions.add(product);
                    if(suggestions.size()==3){
                        break;
                    }
                }
            }
                result.add(suggestions);
        }
        return result;

    }
}
