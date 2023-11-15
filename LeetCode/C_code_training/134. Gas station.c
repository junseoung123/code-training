class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n=gas.size();
        int total_gas=0,total_cost=0;
        int current_gas=0, starting_point=0;
        for(int i=0; i<n; i++){
            total_gas+=gas[i];
            total_cost+=cost[i];

            current_gas+=gas[i]-cost[i];
            if(current_gas<0){
                starting_point=i+1;

                current_gas=0;
            }
        }
        return (total_gas<total_cost)?-1:starting_point;
    }
};
