#include <bits/stdc++.h>

using namespace std;

int main()
{
	int n;
	while(cin >> n, n)
	{
		bool function1 = 1, function2 = 1;
		map<string, string> mp1, mp2;
		string s1, s2;

		for(int i = 0; i < n; i++)
		{
			cin >> s1 >> s2 >> s2;
			if(mp1.find(s1) != mp1.end() && mp1[s1] != s2)
				function1 = 0;
			mp1[s1] = s2;

			if(mp2.find(s2) != mp2.end() && mp2[s2] != s1)
				function2 = 0;
			mp2[s2] = s1;
		}

		if(function1 && function2)
			printf("Invertible.\n");
		else if(function1)
			printf("Not invertible.\n");
		else
			printf("Not a function.\n");
	}
	return 0;
}