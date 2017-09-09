import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }

    /**
     * Determine o número de membros que se associaram no
     * mês dado.
     * @param month O mês que se deseja saber
     * @return O número de membros que se associaram no mês.
     */
    public int joinedInMonth(int month)
    {
        int associations = 0; // contador de associacoes

        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return associations;
        }

        // para cada membro
        for (Membership member : members) {
            // se o mes de associacao é igual ao passado por parâmetro
            if (member.getMonth() == month) {
                associations++; // incrementa
            }
        }

        return associations; // retorna o numero de membros associados no mes
    }

    /**
     * Remove da coleção club todos os membros que
     * se associaram no mês dado e retorna-os armazenados
     * em um objeto de coleção separado.
     * @param month O mês da associação.
     * @param year O ano da associação.
     * @return Os membros que se associaram no mês e ano especificados
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> removed = new ArrayList<>();
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month!");
            return removed;
        }
        
        for (Membership member : members) {
            if (member.getMonth() == month && member.getYear() == year) {
                removed.add(member);
            }
        }
        
        members.removeAll(removed);
        
        return removed;
    }
    
}
