#include <iostream>
#include <map>
#include <string>

int main() {
    // создаём словарь (map) где ключ - string, значение - int
    std::map<std::string, int> hash;

    hash["beer"] = 100;
    hash["wisky"] = 650;
    hash["vodka"] = 350;

    // выводим содержимое
    for (const auto& pair : hash) {
        std::cout << pair.first << ", " << pair.second << std::endl;
    }

    return 0;
}
